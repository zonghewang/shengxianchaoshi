package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.test;

import javax.annotation.Resource;

import org.junit.Test;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util.BaseTest;

public class StorehouseServiceTest extends BaseTest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "StorehouseService")
	IStorehouseService storehouseService;
	
	/**
	 * 测试获取全部仓储信息
	 */
	@Test
	public void getAll() {
		System.out.println(storehouseService.getAllOutgoingAndInfoInfoByStorehouse());
	}

}
