package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.StorehouseMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Storehouse;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.StorehouseExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseNameService;

@Service("storehouseNameService")
public class StorehouseNameServiceImpl extends  StorehouseServiceImpl implements IStorehouseNameService{

	@Resource
	StorehouseMapper storehouseMapper;
	@Override
	public Boolean setStorehouseName(Storehouse storehouse) {
		// TODO Auto-generated method stub
//		storehouseMapper.insert(storehouse);
//		return true;
		if (storehouseMapper.insert(storehouse)==1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Storehouse> getStorehouseByName(Storehouse storehouse) {
		// TODO Auto-generated method stub
//		StorehouseExample storehouseExample = new StorehouseExample();
//		storehouseExample.createCriteria().andStorehouseNameLike("%"+storehouse.getStorehouseName()+"%");
//		List<Storehouse>storehouses=storehouseMapper.selectByExample(storehouseExample);
//		return storehouses;
		StorehouseExample storehouseExample = new StorehouseExample();
		storehouseExample.createCriteria().andStorehouseNameLike("%"+storehouse.getStorehouseName()+"%");
		List<Storehouse>storehouses = storehouseMapper.selectByExample(storehouseExample);
		return storehouses;
	}

	@Override
	public Storehouse getStorehouseNameById(Storehouse storehouse) {
		// TODO Auto-generated method stub
		return storehouseMapper.selectByPrimaryKey(storehouse.getPkSid());
	}

	@Override
	public Boolean updateStorehouseName(Storehouse storehouse) {
		// TODO Auto-generated method stub
		Storehouse oldstorehouse=storehouseMapper.selectByPrimaryKey(storehouse.getPkSid());
		StorehouseExample storehouseExample=new StorehouseExample();
		storehouseExample.createCriteria().andStorehouseNameEqualTo(oldstorehouse.getStorehouseName());
		storehouse.setPkSid(null);
		storehouseMapper.updateByExampleSelective(storehouse, storehouseExample);
		
		return true;
	}

	@Override
	public Boolean deleteStorehouseName(Storehouse storehouse) {
		// TODO Auto-generated method stub
		storehouseMapper.deleteByPrimaryKey(storehouse.getPkSid());
		return true;
	}

	@Override
	public List<Storehouse> getAllStorehouse() {
		// TODO Auto-generated method stub
		StorehouseExample storehouseExample=new StorehouseExample();
		storehouseExample.createCriteria().andPkPidIsNull();
		List<Storehouse>Storehouses=storehouseMapper.selectByExample(storehouseExample);
		return Storehouses;
	}

}
