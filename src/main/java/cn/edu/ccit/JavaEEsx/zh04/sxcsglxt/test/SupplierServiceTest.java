package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.test;

import javax.annotation.Resource;

import org.junit.Test;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ISupplierService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util.BaseTest;

public class SupplierServiceTest extends BaseTest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name = "SupplierService")
	ISupplierService supplierService;
	
	/**
	 * 插入仓库数据测试
	 */
	@Test
	public void insertTest() {
		SupplierProduct supplierProduct = new SupplierProduct();
		for (int i = 101; i < 201; i++) {
			supplierProduct.setSupplierName("红富士"+i);
			supplierProduct.setSupplierAddr(i+"环");
			supplierProduct.setSupplierTel("13111111111");
			supplierProduct.setPkPid(1L);
			supplierService.createSupplierProduct(supplierProduct);
			System.out.println("okkk");
		}
		
	}
	/**
	 * 获取全部数据
	 */
	@Test
	public void getAllTest() {
		System.out.println(supplierService.getAllSupplierProduct());
	}
	/**
	 * 获取通过名称的数据
	 */
	@Test
	public void getByNameTest() {
		SupplierProduct supplierProduct = new SupplierProduct();
		supplierProduct.setSupplierName("15");
		System.out.println(supplierService.getSupplierProductByName(supplierProduct));
	}
}
