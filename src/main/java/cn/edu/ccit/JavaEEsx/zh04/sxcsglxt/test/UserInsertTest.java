package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.test;

import javax.annotation.Resource;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.UserMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util.BaseTest;

public class UserInsertTest extends BaseTest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource
	UserMapper userMapper;
	
	
	/**
	 * 测试插入方法
	 */
	public void insertUserAndGetIdTest() {
		User user=new User();
		user.setUserName("66");
		user.setUserPassword("666666");
		//userMapper.insert(record);
	}
	

}
