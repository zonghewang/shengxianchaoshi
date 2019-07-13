package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Menu;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Role;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IUserService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util.BaseTest;

public class UserServiceTest extends BaseTest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private IUserService userService;
	
	/**
	 * 插入数据测试
	 */
	@Test
	public void insertUserTest() {
		//System.out.println("666");
		if(userService.insertUser("admin", "123456")==true) {
			System.out.println("okokok");
		}else {
			System.out.println("ffff");
		}
		
	}
	
	/**
	 * 用户存在测试
	 */
	@Test
	public void checkUserTest() {
		
		User user=new User();
		user.setUserName("6666");
		user.setUserPassword("6666");
		System.out.println("测试用户："+user.getUserName()+",密码："+user.getUserPassword()+",状态："+userService.checkUser(user).toString());
		user.setUserPassword("666666");
		System.out.println("测试用户："+user.getUserName()+",密码："+user.getUserPassword()+",状态："+userService.checkUser(user).toString());
	
	}
	/**
	 * 用户角色测试
	 */
	@Test
	public void checkUserRoleTest() {
		User user=new User();
		user.setUserName("6666");
		user.setUserPassword("6666");
		
		user=userService.getUser(user);
		
		List<Role> roles = userService.getRole(user.getPkUid());
		for (Role role : roles) {
			System.out.println(role.getRoleName());
		}
	}
	/**
	 * 用户权限测试
	 */
	@Test
	public void checkUserperTest() {
		User user=new User();
		user.setUserName("1111");
		user.setUserPassword("1111");
		
		user=userService.getUser(user);
		
		List<Menu> roles = userService.getPermission(user.getPkUid());
		for (Menu role : roles) {
			System.out.println(role.getMenuName());
		}
	}

}
