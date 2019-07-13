package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.MenuMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RoleMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.RoleMenuMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserRoleMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Menu;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.MenuExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Role;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RoleMenu;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RoleMenuExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRole;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IUserService;
@Service(value = "userService")
public class UserServiceImpl implements IUserService {
	
	
	@Resource
	RoleMapper roleMapper;//获取角色查询器
	@Resource
	UserRoleMapper userRoleMapper;//获取用户角色查询器
	@Resource
	UserMapper userMapper;//用户查询器
	@Resource
	RoleMenuMapper roleMenuMapper;//角色菜单表
	@Resource
	MenuMapper menuMapper;//菜单表（类似权限表）
	
	@Override
	public List<Role> getRole(Long userId) {
		// TODO Auto-generated method stub
		//对查询器实例化数据库where查询语句构造器
		UserRoleExample userRoleExample=new UserRoleExample();
		//创建查询器并添加查询的值
		userRoleExample.createCriteria().andPkUidEqualTo(userId);
		//执行查询计划
		List<UserRole>userRoles=userRoleMapper.selectByExample(userRoleExample);
		//对每个信息进行分析
		List<Long> userRolePkId=new ArrayList<Long>();
		for (UserRole userRole : userRoles) {
			//添加Rid信息
			userRolePkId.add(userRole.getPkRid());
		}
		//创建Role的where条件构造器
		RoleExample roleExample=new RoleExample();
		//进行批量查询数据
		roleExample.createCriteria().andPkRidIn(userRolePkId);
		//返回查询结果
		return roleMapper.selectByExample(roleExample);
	}

	@Override
	public List<Menu> getPermission(Long userId) {
		// TODO Auto-generated method stub
		List<Role>Roles=getRole(userId);
		List<Long>rids=new ArrayList<Long>();
		for (Role role : Roles) {
			rids.add(role.getPkRid());
		}
		RoleMenuExample roleMenuExample=new RoleMenuExample();
		roleMenuExample.createCriteria().andPkRidIn(rids);
		List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(roleMenuExample);
		List<Long>mids=new ArrayList<Long>();
		for (RoleMenu roleMenu : roleMenus) {
			mids.add(roleMenu.getPkMid());
		}
		MenuExample menuExample=new MenuExample();
		menuExample.createCriteria().andPkMidIn(mids);
		return menuMapper.selectByExample(menuExample);
	}

	@Override
	public Boolean checkUser(User user) {
		// TODO Auto-generated method stub
		UserExample userExample=new UserExample();
		userExample.createCriteria()
		           .andUserNameEqualTo(user.getUserName())
		           .andUserPasswordEqualTo(user.getUserPassword());
		if(userMapper.countByExample(userExample)==1) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean insertUser(String name, String password) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserName(name);
		user.setUserPassword(password);
		if(!checkUser(user)) {
			userMapper.insert(user);
			return true;
		}

		return false;
	}

	@Override
	public Boolean deleteUser(Long userId) {
		// TODO Auto-generated method stub
		if(userMapper.deleteByPrimaryKey(userId)==1) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		if(userMapper.updateByPrimaryKeySelective(user)==1) {
			return true;
		}

		return false;
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
				UserExample userExample=new UserExample();
				userExample.createCriteria()
				           .andUserNameEqualTo(user.getUserName())
				           .andUserPasswordEqualTo(user.getUserPassword());
				if(userMapper.countByExample(userExample)==1) {
					return userMapper.selectByExample(userExample).get(0);
				}

		return null;
	}



}
