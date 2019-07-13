package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ProductMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategoryExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;
@Service("ProductCategoryService")
public class ProductCategoryServiceImpl extends AdminServiceImpl implements IProductCategoryService{
	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserMapper UserMapper;

	@Resource
	cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ProductCategoryMapper ProductCategoryMapper;

	@Override
	public List<ProductCategory> getFirstCategory() {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();

		//对每个信息进行分析
		ProductCategoryExample.createCriteria().andPidEqualTo(1L);
		List<ProductCategory>ProductCategorys=ProductCategoryMapper.selectByExample(ProductCategoryExample);
		return ProductCategorys;
	}

	@Override
	public List<ProductCategory> getSecondCategory() {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();
		ProductCategoryExample.createCriteria().andPidBetween(1000L, 1000000L);

		//对每个信息进行分析
		List<ProductCategory>ProductCategorys=ProductCategoryMapper.selectByExample(ProductCategoryExample);
		return ProductCategorys;
	}

	@Override
	public List<ProductCategory> getThirdCategory() {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();
		ProductCategoryExample.createCriteria().andPidBetween(1000000L, 1000000000L);
		//对每个信息进行分析
		List<ProductCategory>ProductCategorys=ProductCategoryMapper.selectByExample(ProductCategoryExample);
		return ProductCategorys;
	}
	@Override
	public Boolean setFirstCategory(ProductCategory productcategory) {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();

		//对每个信息进行分析
		ProductCategoryExample.createCriteria().andPidEqualTo(1L);

		ProductCategoryMapper.insert(productcategory);
		return true;
	}

	@Override
	public Boolean setSecondCategory(ProductCategory productcategory) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();
				//对每个信息进行分析
				ProductCategoryExample.createCriteria().andPidBetween(1000L, 1000000L);
				ProductCategoryMapper.insert(productcategory);
				return true;
	}

	@Override
	public Boolean setThirdCategory(ProductCategory productcategory) {
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();

		//对每个信息进行分析
		ProductCategoryExample.createCriteria().andPidBetween(1000000L, 1000000000L);

		ProductCategoryMapper.insert(productcategory);
		return true;
	}

	@Override
	public List<ProductCategory> getSecondUseFirst(ProductCategory productcategory) {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();
		ProductCategoryExample.createCriteria()
		                      .andPidBetween(1000L, 1000000L)
		                      .andPidEqualTo(productcategory.getPkPcid());
	    return ProductCategoryMapper.selectByExample(ProductCategoryExample);
	}
	@Override
	public List<ProductCategory> getThirdUseSecond(ProductCategory productcategory) {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();
		ProductCategoryExample.createCriteria()
		                      .andPidEqualTo(productcategory.getPkPcid())
		                      .andPidBetween(1000000L, 1000000000L);
	    return ProductCategoryMapper.selectByExample(ProductCategoryExample);

	}

	@Override
	public Boolean setSecondUseFirst(ProductCategory first, ProductCategory second) {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();
		ProductCategoryExample.createCriteria().andPidEqualTo(second.getPkPcid());
		ProductCategoryMapper.insert(second);
		return true;
		}

	@Override
	public Boolean setThirdUseSecond(ProductCategory second, ProductCategory third) {
		// TODO Auto-generated method stub
		ProductCategoryExample ProductCategoryExample=new ProductCategoryExample();
		ProductCategoryExample.createCriteria().andPidEqualTo(third.getPkPcid());
		ProductCategoryMapper.insert(third);
		return true;
	}

	@Override
	public Boolean updateCategory(ProductCategory productcategory) {
		// TODO Auto-generated method stub
		ProductCategoryMapper.updateByPrimaryKeySelective(productcategory);
		return true;
	}

	@Override
	public Boolean deleteCategory(ProductCategory productcategory) {
		// TODO Auto-generated method stub
		
		ProductCategoryMapper.deleteByPrimaryKey(productcategory.getPkPcid());
		return true;
	}

	@Override
	public ProductCategory getCategory(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		
		return ProductCategoryMapper.selectByPrimaryKey(productCategory.getPkPcid());
	}

}
