package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.internal.runners.model.EachTestNotifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ProductMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.SalesOrderInfoMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.SalesOrderMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.StorehouseMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Storehouse;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.StorehouseExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
@Service("productService")
public class ProductServiceImpl extends AdminServiceImpl implements IProductService{

	@Resource
	ProductMapper productMapper;//获取商品查询器
	@Resource
	SalesOrderMapper salesOrderMapper;//获取商品销售订单查询器
	@Resource
	SalesOrderInfoMapper salesOrderInfoMapper;//获取商品销售订单子表查询器
	@Resource
	StorehouseMapper storehouseMapper;
	@Override
	public Object getAllProduct() {
		// TODO Auto-generated method stub
		List<Product>Products=productMapper.selectByExample(new ProductExample());
		return JSON.toJSONString(Products, true);
	}

	@Override
	public Boolean setProduct(Product product) {
		// TODO Auto-generated method stub
		//productMapper.insert(product);
		try {
			if (productMapper.insert(product)==1) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			if (productMapper.updateByPrimaryKey(product)==1) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}

	@Override
	public List<Product> getProductByName(Product product) {
		// TODO Auto-generated method stub
		ProductExample productExample = new ProductExample();
		productExample.createCriteria().andProductCategoryNameLike("%"+product.getProductCategoryName()+"%");
		List<Product>products = productMapper.selectByExample(productExample);
		return products;
	}

	@Override
	public Product getProductById(Product product) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(product.getPkPid());
	}

	@Override
	public List<Product> getAllAlertProduct() {
		// TODO Auto-generated method stub
		List<Storehouse>all = storehouseMapper.selectByExample(new StorehouseExample());
		List<Long>arrays = new ArrayList<Long>();
		for (Storehouse storehouse : all) {
			if(storehouse.getStorehouseNum()<storehouse.getStorehouseMin()||storehouse.getStorehouseNum()>storehouse.getStorehouseMax()) {
				arrays.add(storehouse.getPkPid());
			}
		}
		if (arrays.size() == 0) {
			return new ArrayList<Product>();
		}
		ProductExample productExample = new ProductExample();
		productExample.createCriteria().andPkPidIn(arrays);
		productMapper.selectByExample(productExample);
		return productMapper.selectByExample(productExample);
	}

	@Override
	public List<Product> getProductByPkPcid(Product product) {
		// TODO Auto-generated method stub
		ProductExample productExample = new ProductExample();
		productExample.createCriteria().andPkPcidEqualTo(product.getPkPcid());
		return productMapper.selectByExample(productExample);
	}

	@Override
	public Boolean deleteProductByPkPcid(Product product) {
		// TODO Auto-generated method stub
		if(productMapper.deleteByPrimaryKey(product.getPkPid())==1) {
			return true;
		};
		return false;
	}

}
