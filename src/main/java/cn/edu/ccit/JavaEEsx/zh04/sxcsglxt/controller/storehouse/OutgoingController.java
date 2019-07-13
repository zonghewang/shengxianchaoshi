package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.storehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ListForm;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Buy;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Employee;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecord;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductBuyService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseInOrOutService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ISupplierService;
@Controller
@RequestMapping("/admin/storehouse/outgoing")
public class OutgoingController {
	@Resource
	IStorehouseInOrOutService storehouseInOrOutService;
	
	@Resource
	IProductCategoryService productCategoryService;
	@Resource
	ISupplierService supplierService;
	@Resource
	IProductService productService;
	@Resource
	IEmployeeService  employeeService;
	@Resource
	IProductBuyService  productBuyService;


//	@RequiresPermissions("出入库管理")
	@RequestMapping("/show")
	public String show(Model model) {
		List<OutgoingRecord> outgoingRecords = storehouseInOrOutService.OutgoingRecord();
		List<Object> obj = JSON.parseObject(employeeService.getAllUserAndSetEmployeeRoleCategory().toString(),
				new TypeReference<List<Object>>() {
				});
		List<Employee> employees = JSON.parseObject(obj.get(1).toString(), new TypeReference<List<Employee>>() {
		});
		Map<Long, String> employeesIndexMap = new HashMap<Long, String>();
		for (Employee employee : employees) {
			employeesIndexMap.put(employee.getPkUid(), employee.getEmpName());
		}
		List<Buy>buys= new ArrayList<Buy>();
		Map<Long, String> productBuyIndexMap = new HashMap<Long, String>();
		buys= productBuyService.getAllBuy();
		for (Buy buy : buys) {
			productBuyIndexMap.put(buy.getPkBid(), buy.getBuyName());
		}
		
		model.addAttribute("productBuyIndex", productBuyIndexMap);
		model.addAttribute("employeesIndex", employeesIndexMap);
		model.addAttribute("outgoingRecords", outgoingRecords);
		return "admin/storehouse/outgoing/show";
	}
	
//	@RequiresPermissions("出入库信息删除")
	@RequestMapping("/delete")
	public ModelAndView delete(OutgoingRecord outgoing) {
		ModelAndView modelAndView = new ModelAndView();
		if (storehouseInOrOutService.deleteStorehouse(outgoing) == true) {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "true");
			return modelAndView;

		} else {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "false");
			return modelAndView;

		}
	}
//	@RequiresPermissions("入库信息和详单管理")
	@RequestMapping("/outgoingandinfo/showg")
	public String outgoingandinfoShowg(OutgoingRecord outgoingRecord, Model model) {
		outgoingRecord = storehouseInOrOutService.getOutgoingRecordInfoByOrid(outgoingRecord);

		List<OutgoingRecordInfo> outgoingRecordInfos = storehouseInOrOutService.getOutgoingAndInfoInfoByStorehouseByOrid(outgoingRecord);

		List<Object> obj = JSON.parseObject(employeeService.getAllUserAndSetEmployeeRoleCategory().toString(),
				new TypeReference<List<Object>>() {
				});
		List<Employee> employees = JSON.parseObject(obj.get(1).toString(), new TypeReference<List<Employee>>() {
		});
		Map<Long, String> employeesIndexMap = new HashMap<Long, String>();
		for (Employee employee : employees) {
			employeesIndexMap.put(employee.getPkUid(), employee.getEmpName());
		}

		List<Product> products = JSON.parseObject(productService.getAllProduct().toString(),
				new TypeReference<List<Product>>() {
				});
		Map<Long, String> productsIndexMap = new HashMap<Long, String>();
		for (Product product : products) {
			productsIndexMap.put(product.getPkPid(), product.getProductCategoryName());
		}

		model.addAttribute("productsIndex", productsIndexMap);

		model.addAttribute("employeesIndex", employeesIndexMap);

		model.addAttribute("outgoingRecord", outgoingRecord);

		model.addAttribute("outgoingRecordInfos", outgoingRecordInfos);
		return "admin/storehouse/outgoing/outgoingandinfo/showg";
	}
//	@RequiresPermissions("出库信息和详单管理")
	@RequestMapping("/outgoingandinfo/showo")
	public String outgoingandinfoShowo(OutgoingRecord outgoingRecord, Model model) {
		outgoingRecord = storehouseInOrOutService.getOutgoingRecordInfoByOrid(outgoingRecord);

		List<OutgoingRecordInfo> outgoingRecordInfos = storehouseInOrOutService.getOutgoingAndInfoInfoByStorehouseByOrid(outgoingRecord);

		List<Object> obj = JSON.parseObject(employeeService.getAllUserAndSetEmployeeRoleCategory().toString(),
				new TypeReference<List<Object>>() {
				});
		List<Employee> employees = JSON.parseObject(obj.get(1).toString(), new TypeReference<List<Employee>>() {
		});
		Map<Long, String> employeesIndexMap = new HashMap<Long, String>();
		for (Employee employee : employees) {
			employeesIndexMap.put(employee.getPkUid(), employee.getEmpName());
		}

		List<Product> products = JSON.parseObject(productService.getAllProduct().toString(),
				new TypeReference<List<Product>>() {
				});
		Map<Long, String> productsIndexMap = new HashMap<Long, String>();
		for (Product product : products) {
			productsIndexMap.put(product.getPkPid(), product.getProductCategoryName());
		}

		model.addAttribute("productsIndex", productsIndexMap);

		model.addAttribute("employeesIndex", employeesIndexMap);

		model.addAttribute("outgoingRecord", outgoingRecord);

		model.addAttribute("outgoingRecordInfos", outgoingRecordInfos);
		return "admin/storehouse/outgoing/outgoingandinfo/showo";
	}
//	@RequiresPermissions("入库信息和详单添加")
	@RequestMapping("/outgoingandinfo/addg")
	public ModelAndView outgoingandinfoAddg(OutgoingRecord outgoingRecord, HttpServletRequest request, Model model, ListForm outgoingRecordInfos) {
		ProductCategory productCategory = new ProductCategory();

		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata2") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata2")));
			modelAndView.addObject("setdata", productCategoryService.getThirdUseSecond(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata3") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			Product product = new Product();
			product.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			modelAndView.addObject("setdata", productService.getProductByPkPcid(product));
			return modelAndView;
		} else if (request.getParameter("getdata4") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			SupplierProduct supplierProduct = new SupplierProduct();

			supplierProduct.setPkPid(Long.parseLong(request.getParameter("getdata4")));
			modelAndView.addObject("setdata", supplierService.getSupplierProductByPId(supplierProduct));
			return modelAndView;
		} else {
			if (outgoingRecord.getOutgoingRecordTime() != null) {

				if (storehouseInOrOutService.createStorehouseInOrOutAndSetInfo (outgoingRecord, JSON.toJSONString(outgoingRecordInfos.getOutgoingRecordInfos())) == true) {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "true");
					return modelAndView;

				} else {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "false");
					return modelAndView;

				}

			}
		}

		model.addAttribute("uId", supplierService.getUId());
		model.addAttribute("userName", supplierService.getUserName());

		modelAndView.setViewName("admin/storehouse/outgoing/outgoingandinfo/addg");
		return modelAndView;
	}
//	@RequiresPermissions("出库信息和详单添加")
	@RequestMapping("/outgoingandinfo/addo")
	public ModelAndView outgoingandinfoAddo(OutgoingRecord outgoingRecord, HttpServletRequest request, Model model, ListForm outgoingRecordInfos) {
		ProductCategory productCategory = new ProductCategory();

		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata2") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata2")));
			modelAndView.addObject("setdata", productCategoryService.getThirdUseSecond(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata3") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			Product product = new Product();
			product.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			modelAndView.addObject("setdata", productService.getProductByPkPcid(product));
			return modelAndView;
		} else if (request.getParameter("getdata4") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			SupplierProduct supplierProduct = new SupplierProduct();

			supplierProduct.setPkPid(Long.parseLong(request.getParameter("getdata4")));
			modelAndView.addObject("setdata", supplierService.getSupplierProductByPId(supplierProduct));
			return modelAndView;
		} else {
			if (outgoingRecord.getOutgoingRecordTime() != null) {

				if (storehouseInOrOutService.createStorehouseInOrOutAndSetInfo (outgoingRecord, JSON.toJSONString(outgoingRecordInfos.getOutgoingRecordInfos())) == true) {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "true");
					return modelAndView;

				} else {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "false");
					return modelAndView;

				}

			}
		}

		model.addAttribute("uId", supplierService.getUId());
		model.addAttribute("userName", supplierService.getUserName());

		modelAndView.setViewName("admin/storehouse/outgoing/outgoingandinfo/addo");
		return modelAndView;
	}
//	@RequiresPermissions("入库信息和详单修改")
	@RequestMapping("/outgoingandinfo/updateg")
	public ModelAndView outgoingandinfoUpdateg(OutgoingRecord outgoingRecord, HttpServletRequest request, Model model, ListForm outgoingRecordInfos) {
		ProductCategory productCategory = new ProductCategory();

		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata2") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata2")));
			modelAndView.addObject("setdata", productCategoryService.getThirdUseSecond(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata3") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			Product product = new Product();
			product.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			modelAndView.addObject("setdata", productService.getProductByPkPcid(product));
			return modelAndView;
		} else if (request.getParameter("getdata4") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			SupplierProduct supplierProduct = new SupplierProduct();

			supplierProduct.setPkPid(Long.parseLong(request.getParameter("getdata4")));
			modelAndView.addObject("setdata", supplierService.getSupplierProductByPId(supplierProduct));
			return modelAndView;
		} else {
			if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

				if (storehouseInOrOutService.updateStorehouseInOrOutAndSetInfo(outgoingRecord, JSON.toJSONString(outgoingRecordInfos.getBuyInfos())) == true) {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "true");
					return modelAndView;

				} else {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "false");
					return modelAndView;

				}

			}
		}

		outgoingRecord = storehouseInOrOutService.getOutgoingRecordInfoByOrid(outgoingRecord);
		User user = new User();
		user.setPkUid(outgoingRecord.getPkUid());

		List<Object> obj = JSON.parseObject(employeeService.getUserAndSetEmployeeRoleCategoryByUid(user).toString(),
				new TypeReference<List<Object>>() {
				});
		Employee employee = JSON.parseObject(obj.get(1).toString(),new TypeReference<Employee>() {
		});
		
		model.addAttribute("buyInfos", storehouseInOrOutService.getOutgoingAndInfoInfoByStorehouseByOrid(outgoingRecord));
		
		model.addAttribute("outgoingRecord", outgoingRecord);
		
		model.addAttribute("uId", outgoingRecord.getPkUid());
		model.addAttribute("userName", employee.getEmpName());

		modelAndView.setViewName("admin/storehouse/outgoing/outgoingandinfo/updateg");
		return modelAndView;
	}
//	@RequiresPermissions("出库信息和详单修改")
	@RequestMapping("/outgoingandinfo/updateo")
	public ModelAndView outgoingandinfoUpdateo(OutgoingRecord outgoingRecord, HttpServletRequest request, Model model, ListForm outgoingRecordInfos) {
		ProductCategory productCategory = new ProductCategory();

		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata2") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata2")));
			modelAndView.addObject("setdata", productCategoryService.getThirdUseSecond(productCategory));
			return modelAndView;
		} else if (request.getParameter("getdata3") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			Product product = new Product();
			product.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			modelAndView.addObject("setdata", productService.getProductByPkPcid(product));
			return modelAndView;
		} else if (request.getParameter("getdata4") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			SupplierProduct supplierProduct = new SupplierProduct();

			supplierProduct.setPkPid(Long.parseLong(request.getParameter("getdata4")));
			modelAndView.addObject("setdata", supplierService.getSupplierProductByPId(supplierProduct));
			return modelAndView;
		} else {
			if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

				if (storehouseInOrOutService.updateStorehouseInOrOutAndSetInfo(outgoingRecord, JSON.toJSONString(outgoingRecordInfos.getBuyInfos())) == true) {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "true");
					return modelAndView;

				} else {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "false");
					return modelAndView;

				}

			}
		}

		outgoingRecord = storehouseInOrOutService.getOutgoingRecordInfoByOrid(outgoingRecord);
		User user = new User();
		user.setPkUid(outgoingRecord.getPkUid());

		List<Object> obj = JSON.parseObject(employeeService.getUserAndSetEmployeeRoleCategoryByUid(user).toString(),
				new TypeReference<List<Object>>() {
				});
		Employee employee = JSON.parseObject(obj.get(1).toString(),new TypeReference<Employee>() {
		});
		
		model.addAttribute("buyInfos", storehouseInOrOutService.getOutgoingAndInfoInfoByStorehouseByOrid(outgoingRecord));
		
		model.addAttribute("outgoingRecord", outgoingRecord);
		
		model.addAttribute("uId", outgoingRecord.getPkUid());
		model.addAttribute("userName", employee.getEmpName());
		
		modelAndView.setViewName("admin/storehouse/outgoing/outgoingandinfo/updateo");
		return modelAndView;
	}
//	@RequiresPermissions("入库信息和详单删除")
	@RequestMapping("/outgoingandinfo/deleteg")
	public ModelAndView outgoingandinfoDeleteg(OutgoingRecordInfo outgoingRecordInfo) {
		ModelAndView modelAndView = new ModelAndView();
		if (storehouseInOrOutService.deleteOutgoingRecordInfoByInfoId(outgoingRecordInfo) == true) {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "true");
			return modelAndView;

		} else {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "false");
			return modelAndView;

		}
	}
//	@RequiresPermissions("出库信息和详单删除")
	@RequestMapping("/outgoingandinfo/deleteo")
	public ModelAndView outgoingandinfoDeleteo(OutgoingRecordInfo outgoingRecordInfo) {
		ModelAndView modelAndView = new ModelAndView();
		if (storehouseInOrOutService.deleteOutgoingRecordInfoByInfoId(outgoingRecordInfo) == true) {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "true");
			return modelAndView;

		} else {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "false");
			return modelAndView;

		}
	}
	
}

