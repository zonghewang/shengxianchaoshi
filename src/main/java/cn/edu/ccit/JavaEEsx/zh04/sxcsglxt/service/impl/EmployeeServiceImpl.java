package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.EmployeeMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.EmployeeProductCategoryMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserRoleMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Customer;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.CustomerExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Employee;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategoryExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRole;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;

@Service(value = "employeeService")
public class EmployeeServiceImpl extends AdminServiceImpl implements IEmployeeService{

	@Resource
	EmployeeMapper employeeMapper;
	@Resource
	UserMapper userMapper;
	@Resource
	UserRoleMapper userRoleMapper;
	@Resource
	EmployeeProductCategoryMapper employeeProductCategoryMapper;
	@Override
	public Boolean createUserAndSetEmployeeRoleCategory(User user, Employee employee, UserRole role,
			EmployeeProductCategory category) {
		// TODO Auto-generated method stub
		if(insertUser(user.getUserName(), user.getUserPassword())==true)
		{
			UserExample userExample=new UserExample();
			userExample.createCriteria()
			           .andUserNameEqualTo(user.getUserName())
			           .andUserPasswordEqualTo(user.getUserPassword());
			User u = userMapper.selectByExample(userExample).get(0);
			Long pk_uid=u.getPkUid();
			employee.setPkUid(Long.parseLong(String.valueOf(pk_uid)));
			long a = employeeMapper.insert(employee);
			role.setPkUid(Long.parseLong(String.valueOf(pk_uid)));
			long b = userRoleMapper.insert(role);
			if(category!=null) {
				category.setPkUid(Long.parseLong(String.valueOf(pk_uid)));
				long c = employeeProductCategoryMapper.insert(category);
			}

			if(a!=0&&b!=0&&pk_uid!=0)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public Boolean updateUserAndSetEmployeeRoleCategoryByUId(User user, Employee employee, UserRole role,
			EmployeeProductCategory category) {
		// TODO Auto-generated method stub
		
		UserExample userExample = new UserExample();
		userExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		long a = userMapper.updateByExampleSelective(user, userExample);
		EmployeeExample employeeExample = new EmployeeExample();
		employeeExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		long b = employeeMapper.updateByExampleSelective(employee, employeeExample);
		UserRoleExample userRoleExample = new UserRoleExample();
		userRoleExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		long c = userRoleMapper.updateByExampleSelective(role, userRoleExample);
		EmployeeProductCategoryExample employeeProductCategoryExample = new EmployeeProductCategoryExample();
		employeeProductCategoryExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		long d = employeeProductCategoryMapper.updateByExampleSelective(category, employeeProductCategoryExample);
		if(a!=0&&b!=0&&c!=0&&c!=0||d!=0)
			return true;
		else
			return false;
	}

	@Override
	public Object getUserAndSetEmployeeRoleCategoryByUid(User user) {
		// TODO Auto-generated method stub
		long pk_uid = user.getPkUid();
		User users= userMapper.selectByPrimaryKey(pk_uid);//只获取该用户的全部信息（通过ID）
		Employee employees = employeeMapper.selectByPrimaryKey(pk_uid);
		UserRole roles = userRoleMapper.selectByPrimaryKey(pk_uid);
		EmployeeProductCategory categorys = employeeProductCategoryMapper.selectByPrimaryKey(pk_uid);
		
		List<Object>obj = new ArrayList<Object>();
		obj.add(users);
		obj.add(employees);
		obj.add(roles);
		obj.add(categorys);
		return JSON.toJSONString(obj, true);
	}

	@Override
	public Boolean deleteUserAndSetEmployeeRoleCategoryByUid(User user) {
		// TODO Auto-generated method stub
		
		
		EmployeeProductCategoryExample employeeProductCategoryExample = new EmployeeProductCategoryExample();
		employeeProductCategoryExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		int d = employeeProductCategoryMapper.deleteByExample(employeeProductCategoryExample);
		
		UserRoleExample userRoleExample = new UserRoleExample();
		userRoleExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		int c = userRoleMapper.deleteByExample(userRoleExample);
		
		EmployeeExample employeeExample = new EmployeeExample();
		employeeExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		int b = employeeMapper.deleteByExample(employeeExample);
		
		
		UserExample userExample = new UserExample();
		userExample.createCriteria().andPkUidEqualTo(user.getPkUid());
		int a = userMapper.deleteByExample(userExample);
		
		
		if(a!=0&&b!=0&&c!=0||d!=0)
			return true;
		else
			return false;
	}

	@Override
	public Object getAllUserAndSetEmployeeRoleCategory() {
		// TODO Auto-generated method stub
		List<Object>obj = new ArrayList<Object>();
		List<User> users =userMapper.selectByExample(new UserExample()) ;
		List<Employee> employees = employeeMapper.selectByExample(new EmployeeExample());
		List<UserRole> roles = userRoleMapper.selectByExample(new UserRoleExample());
		List<EmployeeProductCategory> categorys = employeeProductCategoryMapper.selectByExample(new EmployeeProductCategoryExample());
		obj.add(users);
		obj.add(employees);
		obj.add(roles);
		obj.add(categorys);
		return JSON.toJSONString(obj, true);
	}

}
