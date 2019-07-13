package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.CustomerMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Customer;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.CustomerExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Menu;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Role;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ICustomerService;

@Service("customerService")
public class CustomerServiceImpl extends AdminServiceImpl implements ICustomerService{
	@Resource
	CustomerMapper customerMapper;
	@Override
	public Boolean createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int i = customerMapper.insert(customer);
		if(i==0)
			return false;
		else
			return true;
	}

	@Override
	public Boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		CustomerExample customerExample = new CustomerExample();
		customerExample.createCriteria()
		               .andPkCidEqualTo(customer.getPkCid());
		
		int i = customerMapper.updateByExampleSelective(customer, customerExample);//此处可以有选择地进行更新字段，不更新的字段自动为空。
		if(i==0)
			return false;
		else
			return true;
	}

	@Override
	public Boolean deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int i = customerMapper.deleteByPrimaryKey(customer.getPkCid());
		if(i==0)
			return false;
		else
			return true;
	}

	@Override
	public Customer getCustomerById(Customer customer) {
		// TODO Auto-generated method stub
		Long pkCid = customer.getPkCid();		
		return customerMapper.selectByPrimaryKey(pkCid);
	}		

	@Override
	public Object getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer>customers=customerMapper.selectByExample(new CustomerExample());
		
		return JSON.toJSONString(customers, true);
	}

	@Override
	public Customer getCustomerByCardNo(Customer customer) {
		// TODO Auto-generated method stub
		CustomerExample example = new CustomerExample();
		example.createCriteria().andVipNoEqualTo(customer.getVipNo());
		List<Customer> customers = customerMapper.selectByExample(example);
		if(customers.size()==0) {
			return customer;
		}else {
			return customers.get(0);
			
		}
		
	}

	

	

}
