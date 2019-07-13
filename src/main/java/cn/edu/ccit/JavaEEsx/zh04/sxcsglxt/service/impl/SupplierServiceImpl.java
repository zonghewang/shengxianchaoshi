package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.SupplierProductMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProductExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ISupplierService;
@Service(value = "supplierService")
public class SupplierServiceImpl extends AdminServiceImpl implements ISupplierService {

	@Resource
	SupplierProductMapper supplierProductMapper;
	@Override
	public Boolean createSupplierProduct(SupplierProduct supplierproduct) {
		// TODO Auto-generated method stub
		if(supplierProductMapper.insert(supplierproduct)==1) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateSupplierProductById(SupplierProduct supplierproduct) {
		// TODO Auto-generated method stub
		if(supplierProductMapper.updateByPrimaryKeySelective(supplierproduct)==1) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteSupplierProductById(SupplierProduct supplierproduct) {
		// TODO Auto-generated method stub
		if(supplierProductMapper.deleteByPrimaryKey(supplierproduct.getPkSpid())==1) {
			return true;
		}
		return false;
	}
	@Override
	public Object getSupplierProductByName(SupplierProduct supplierproduct) {
		// TODO Auto-generated method stub
		SupplierProductExample supplierProductExample = new SupplierProductExample();
		supplierProductExample.createCriteria().andSupplierNameLike("%"+supplierproduct.getSupplierName()+"%");
		List<SupplierProduct>supplierProducts = supplierProductMapper.selectByExample(supplierProductExample);
		return JSON.toJSONString(supplierProducts, true);
	}
	@Override
	public SupplierProduct getSupplierProductById(SupplierProduct supplierproduct) {
		// TODO Auto-generated method stub
		return supplierProductMapper.selectByPrimaryKey(supplierproduct.getPkSpid());
	}

	@Override
	public Object getAllSupplierProduct() {
		// TODO Auto-generated method stub
		List<SupplierProduct>supplierProducts = supplierProductMapper.selectByExampleWithBLOBs(new SupplierProductExample());
		return JSON.toJSONString(supplierProducts, true);
	}

	@Override
	public List<SupplierProduct> getSupplierProductByPId(SupplierProduct supplierProduct) {
		// TODO Auto-generated method stub
		SupplierProductExample example= new SupplierProductExample();
		example.createCriteria().andPkPidEqualTo(supplierProduct.getPkPid());
		return supplierProductMapper.selectByExample(example);
	}




}
