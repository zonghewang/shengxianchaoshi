package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.storehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Employee;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategoryExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecord;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Storehouse;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRole;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseNameService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseService;

@Controller
@RequestMapping("/admin/storehouse")
public class StorehouseShowController {
	@Resource
	IStorehouseService storehouseService;
	@Resource
	IProductService productService;
	@Resource
	IStorehouseNameService storehouseNameService;
	@Resource
	IEmployeeService employeeService;
//	@RequiresPermissions("库存报表")
	@RequestMapping("/show")
	public String show(Model model) {
		
		List<OutgoingRecordInfo> outgoingRecordInfos = storehouseService.getAllOutgoingRecordInfo();
		
		model.addAttribute("outgoingRecordInfos", outgoingRecordInfos);
		
		List<OutgoingRecord> outgoingRecords = storehouseService.getAllOutgoingRecord();
		
		Map<Long, OutgoingRecord>outgoingRecordsIndexMap= new HashMap<Long, OutgoingRecord>();		
		for (OutgoingRecord outgoingRecord : outgoingRecords) {
			outgoingRecordsIndexMap.put(outgoingRecord.getPkOrid(), outgoingRecord);
		}
		List<Product> products= JSON.parseObject(productService.getAllProduct().toString(), new TypeReference<List<Product>>() {})  ;
		
		Map<Long, Product>productsIndexMap= new HashMap<Long, Product>();		
		for (Product product : products) {
			productsIndexMap.put(product.getPkPid(), product);
		}
		Map<Long, Storehouse>storehouseIndexMap= new HashMap<Long, Storehouse>();		
		for (Storehouse storehouse : storehouseNameService.getAllStorehouse()) {
			storehouseIndexMap.put(storehouse.getPkSid(), storehouse);
		}
		
		
		List<Object>obj = JSON.parseObject(employeeService.getAllUserAndSetEmployeeRoleCategory().toString(), new TypeReference<List<Object>>() {});
		
		List<Employee> employees = JSON.parseObject(obj.get(1).toString(), new TypeReference<List<Employee>>() {});
		
		Map<Long, Employee>employeeIndexMap= new HashMap<Long, Employee>();		
		for (Employee employee : employees) {
			employeeIndexMap.put(employee.getPkUid(), employee);
		}
		
		
		model.addAttribute("outgoingRecordsIndex", outgoingRecordsIndexMap);
		model.addAttribute("productsIndex", productsIndexMap);
		model.addAttribute("storehouseIndex", storehouseIndexMap);
		model.addAttribute("employeeIndex", employeeIndexMap);
		
		return "admin/storehouse/show";
	}
//	@RequiresPermissions("库存预警")
	@RequestMapping("/alert/show")
	public String alertShow(Model model) {	
		List<Storehouse> storehouses = storehouseService.getAllAlertInfo();	
		model.addAttribute("storehouses", storehouses);
		List<Product> products= JSON.parseObject(productService.getAllProduct().toString(), new TypeReference<List<Product>>() {})  ;		
		Map<Long, Product>productsIndexMap= new HashMap<Long, Product>();		
		for (Product product : products) {
			productsIndexMap.put(product.getPkPid(), product);
		}
		
		model.addAttribute("productsIndex", productsIndexMap);

		return "admin/storehouse/alert/show";
	}
}