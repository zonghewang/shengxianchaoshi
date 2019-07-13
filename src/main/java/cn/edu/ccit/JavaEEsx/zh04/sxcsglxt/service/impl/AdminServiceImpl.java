package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.EmployeeMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Menu;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Role;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IAdminService;
@Service("adminService")
public class AdminServiceImpl extends UserServiceImpl implements IAdminService {

	@Resource
	EmployeeMapper employeeMapper;
	
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		EmployeeExample employeeExample = new EmployeeExample();
		employeeExample.createCriteria().andPkUidEqualTo(getUId());
		
		return employeeMapper.selectByExample(employeeExample).get(0).getEmpName();
	}

	@Override
	public Long getUId() {
		// TODO Auto-generated method stub
		Subject subject =org.apache.shiro.SecurityUtils.getSubject();
		return ((User)subject.getPrincipal()).getPkUid();
	}
	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return roleMapper.selectByExample(new RoleExample());
	}
}
