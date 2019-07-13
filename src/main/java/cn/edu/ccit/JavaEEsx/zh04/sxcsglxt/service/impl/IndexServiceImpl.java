package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.CustomerMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.EmployeeMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ProductMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RefundsInfoMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RefundsMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.SalesOrderMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.CustomerExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Refunds;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfoExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IIndexService;

@Service(value = "indexService")
public class IndexServiceImpl extends AdminServiceImpl implements IIndexService{

	@Resource
	EmployeeMapper employeeMapper;
	@Resource
	ProductMapper productMapper;
	@Resource
	CustomerMapper customerMapper;
	@Resource
	SalesOrderMapper salesOrderMapper;
	@Resource
	RefundsInfoMapper refundsInfoMapper;
	@Override
	public int getEmployeeNum() {
		// TODO Auto-generated method stub
		return employeeMapper.countByExample(new EmployeeExample());
		
	}

	@Override
	public int getProductNum() {
		// TODO Auto-generated method stub
		return productMapper.countByExample(new ProductExample());
	}

	@Override
	public int getCustomerNum() {
		// TODO Auto-generated method stub
		return customerMapper.countByExample(new CustomerExample());
	}

	@Override
	public Long getPrices() {
		// TODO Auto-generated method stub
		List<SalesOrder> salesOrders = salesOrderMapper.selectByExample(new SalesOrderExample());
		List<RefundsInfo> refunds = refundsInfoMapper.selectByExample(new RefundsInfoExample());
		long price = 0;

		for(SalesOrder saleorder:salesOrders) {
			price+=saleorder.getSalesOrderPay();
		}
		for(RefundsInfo refund:refunds) {
			price-=refund.getRefundsInfoPrice();
		}
		return price;
	}

}

