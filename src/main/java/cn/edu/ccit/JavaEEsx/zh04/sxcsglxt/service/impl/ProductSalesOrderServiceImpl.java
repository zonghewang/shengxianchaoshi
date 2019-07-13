package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ProductMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RoleMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.SalesOrderInfoMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.SalesOrderMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserRoleMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Menu;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Role;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfoExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRole;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IAdminService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductSalesOrderService;

@Service("productSalesOrderService")
public class ProductSalesOrderServiceImpl extends ProductServiceImpl implements IProductSalesOrderService {

	@Resource
	ProductMapper productMapper;// 获取商品查询器
	@Resource
	SalesOrderMapper salesOrderMapper;// 获取商品销售订单查询器
	@Resource
	SalesOrderInfoMapper salesOrderInfoMapper;// 获取商品销售订单子表查询器

	@Override
	public Boolean createSeleOrdeAndSetInfo(SalesOrder order, Object info) {
		// TODO Auto-generated method stub
		salesOrderMapper.insert(order);

		SalesOrderExample example = new SalesOrderExample();
		example.createCriteria().andSalesOrderTimeEqualTo(order.getSalesOrderTime()).andPkUidEqualTo(order.getPkUid());
		order = salesOrderMapper.selectByExample(example).get(0);

		List<SalesOrderInfo> salesOrderInfo = JSON.parseObject(info.toString(),
				new TypeReference<List<SalesOrderInfo>>() {
				});
		for (SalesOrderInfo salesOrderInfo2 : salesOrderInfo) {
			salesOrderInfo2.setPkSoid(order.getPkSoid());
			salesOrderInfoMapper.insert(salesOrderInfo2);
		}
		return true;
	}

	@Override
	public Boolean deleteSeleOrdeAndSetInfo(SalesOrder order, Object info) {
		// TODO Auto-generated method stub
		SalesOrderInfoExample salesOrderInfoExample = new SalesOrderInfoExample();
		List<SalesOrderInfo> salesOrderInfo = JSON.parseArray(JSON.toJSONString(info, true), SalesOrderInfo.class);
		List<Long> salesOrderInfoPkSoiidEqualTo = new ArrayList<Long>();
		for (SalesOrderInfo salesOrderInfos : salesOrderInfo) {
			salesOrderInfoPkSoiidEqualTo.add(salesOrderInfos.getPkSoiid());
		}
		salesOrderInfoExample.createCriteria().andPkSoiidIn(salesOrderInfoPkSoiidEqualTo);
		salesOrderInfoMapper.deleteByExample(salesOrderInfoExample);

		SalesOrderExample salesOrderExample = new SalesOrderExample();
		salesOrderExample.createCriteria().andPkSoidEqualTo(order.getPkSoid());
		salesOrderMapper.deleteByExample(salesOrderExample);
		return true;
	}

	@Override
	public Boolean updateSeleOrdeAndSetInfo(SalesOrder order, Object info) {
		// TODO Auto-generated method stub
		SalesOrderExample salesOrderExample = new SalesOrderExample();
		salesOrderExample.createCriteria().andPkSoidEqualTo(order.getPkSoid());
		salesOrderMapper.updateByExampleSelective(order, salesOrderExample);

		SalesOrderInfoExample salesOrderInfoExample = new SalesOrderInfoExample();
		List<SalesOrderInfo> salesOrderInfo = JSON.parseArray(JSON.toJSONString(info, true), SalesOrderInfo.class);
		for (SalesOrderInfo salesOrderInfos : salesOrderInfo) {

			salesOrderInfoExample.createCriteria().andPkSoiidEqualTo(salesOrderInfos.getPkSoiid());
//			salesOrderInfoMapper.updateByExampleSelective(JSON.parseObject(JSON.toJSONString(info, true), SalesOrderInfo.class), salesOrderInfoExample);
			SalesOrderInfo salsorderInfo = salesOrderInfos;
//			salsorderInfo = JSON.parseObject(JSON.toJSONString(info, true), SalesOrderInfo.class);
			salesOrderInfoMapper.updateByExampleSelective(salsorderInfo, salesOrderInfoExample);

		}

		return true;
	}

	@Override
	public Object getSeleOrdeAndSetInfoByName(SalesOrder order) {
		// TODO Auto-generated method stub
		SalesOrderExample salesOrderExample = new SalesOrderExample();
		salesOrderExample.createCriteria().andPkCidEqualTo(order.getPkCid());
		List<SalesOrder> salesOrders = salesOrderMapper.selectByExample(salesOrderExample);
		SalesOrderInfoExample salesOrderInfoExample = new SalesOrderInfoExample();
		salesOrderInfoExample.createCriteria().andPkSoidEqualTo(order.getPkSoid());
		List<SalesOrderInfo> salesOrderInfos = salesOrderInfoMapper.selectByExample(salesOrderInfoExample);
		List<Object> all = new ArrayList<Object>();
		for (SalesOrder salesOrder : salesOrders) {
			all.add(salesOrder);
			for (SalesOrderInfo salesOrderInfo : salesOrderInfos) {
				all.add(salesOrderInfo);
			}
		}
		return JSON.toJSONString(all);
	}

	@Override
	public List<SalesOrderInfo> getSeleOrdeAndSetInfoById(SalesOrder order) {
		// TODO Auto-generated method stub
		SalesOrder orders = salesOrderMapper.selectByPrimaryKey(order.getPkSoid());
		SalesOrderInfoExample salesOrderInfoExample = new SalesOrderInfoExample();
		salesOrderInfoExample.createCriteria().andPkSoidEqualTo(orders.getPkSoid());
		List<SalesOrderInfo> salesOrderInfo = new ArrayList<SalesOrderInfo>();
		salesOrderInfo = JSON.parseArray(JSON.toJSONString(salesOrderInfoMapper.selectByExample(salesOrderInfoExample)),
				SalesOrderInfo.class);
		return salesOrderInfo;
	}

	@Override
	public Object getAllSeleOrdeAndSetInfo() {
		// TODO Auto-generated method stub
		List<SalesOrderInfo> SalesOrderInfos = salesOrderInfoMapper.selectByExample(new SalesOrderInfoExample());
		return JSON.toJSONString(SalesOrderInfos, true);
	}

	@Override
	public Boolean deleteSeleOrder(SalesOrder order) {
		// TODO Auto-generated method stub
		SalesOrderInfoExample salesOrderInfoExample1 = new SalesOrderInfoExample();
		salesOrderInfoExample1.createCriteria().andPkSoidEqualTo(order.getPkSoid());
		salesOrderInfoMapper.deleteByExample(salesOrderInfoExample1);
		salesOrderMapper.deleteByPrimaryKey(order.getPkSoid());
		return true;
	}

	@Override
	public List<SalesOrder> getAllOrders() {
		// TODO Auto-generated method stub
		return salesOrderMapper.selectByExampleWithBLOBs(new SalesOrderExample());
	}

	@Override
	public SalesOrder getBySOid(SalesOrder salesOrder) {
		// TODO Auto-generated method stub
		return salesOrderMapper.selectByPrimaryKey(salesOrder.getPkSoid());
	}

	@Override
	public List<SalesOrderInfo> getAllSeleOrdeAndSetInfoBySoid(SalesOrder salesOrder) {
		// TODO Auto-generated method stub
		SalesOrderInfoExample example = new SalesOrderInfoExample();
		example.createCriteria().andPkSoidEqualTo(salesOrder.getPkSoid());

		return salesOrderInfoMapper.selectByExample(example);
	}

	@Override
	public boolean deleteBuyInfoByInfoId(SalesOrderInfo salesOrderInfo) {
		// TODO Auto-generated method stub
		salesOrderInfoMapper.deleteByPrimaryKey(salesOrderInfo.getPkSoiid());
		return true;
	}

}
