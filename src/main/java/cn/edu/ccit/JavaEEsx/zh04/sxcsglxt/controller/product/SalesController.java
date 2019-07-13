package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.ListForm;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Customer;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Employee;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ICustomerService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductSalesOrderService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ISupplierService;

@Controller
@RequestMapping("/admin/product/sales")
public class SalesController {
	@Resource
	IProductSalesOrderService productSalesOrderService;

	@Resource
	IProductCategoryService productCategoryService;
	@Resource
	ISupplierService supplierService;
	@Resource
	IProductService productService;
	@Resource
	ICustomerService customerService;
	@Resource
	IEmployeeService employeeService;

//	@RequiresPermissions("销售管理")
	@RequestMapping("/show")
	public String show(Model model) {
		List<SalesOrder> orders = productSalesOrderService.getAllOrders();
		List<Object> obj = JSON.parseObject(employeeService.getAllUserAndSetEmployeeRoleCategory().toString(),
				new TypeReference<List<Object>>() {
				});
		List<Employee> employees = JSON.parseObject(obj.get(1).toString(), new TypeReference<List<Employee>>() {
		});
		Map<Long, String> employeesIndexMap = new HashMap<Long, String>();
		for (Employee employee : employees) {
			employeesIndexMap.put(employee.getPkUid(), employee.getEmpName());
		}
		model.addAttribute("employeesIndex", employeesIndexMap);
		model.addAttribute("orders", orders);
		return "admin/product/sales/show";
	}

//	@RequiresPermissions("销售删除")
	@RequestMapping("/delete")
	public ModelAndView delete(SalesOrder selesOrder) {

		ModelAndView modelAndView = new ModelAndView();
		if (productSalesOrderService.deleteSeleOrder(selesOrder) == true) {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "true");
			return modelAndView;

		} else {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "false");
			return modelAndView;

		}
	}

//	@RequiresPermissions("销售和详单管理")
	@RequestMapping("/info/show")
	public String infoShow(SalesOrder salesOrder, Model model) {
		salesOrder = productSalesOrderService.getBySOid(salesOrder);

		List<SalesOrderInfo> salesOrderInfos = productSalesOrderService.getAllSeleOrdeAndSetInfoBySoid(salesOrder);

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

		model.addAttribute("salesOrder", salesOrder);

		model.addAttribute("salesOrderInfos", salesOrderInfos);
		return "admin/product/sales/info/show";
	}

//	@RequiresPermissions("销售和详单修改")
	@RequestMapping("/info/update")
	public ModelAndView infoUpdate(SalesOrder salesOrder, HttpServletRequest request, Model model,
			ListForm salesOrderInfos) {
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

				if (productSalesOrderService.updateSeleOrdeAndSetInfo(salesOrder, JSON.toJSONString(salesOrderInfos.getBuyInfos())) == true) {

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

		salesOrder = productSalesOrderService.getBySOid(salesOrder);
		User user = new User();
		user.setPkUid(salesOrder.getPkUid());

		List<Object> obj = JSON.parseObject(employeeService.getUserAndSetEmployeeRoleCategoryByUid(user).toString(),
				new TypeReference<List<Object>>() {
				});
		Employee employee = JSON.parseObject(obj.get(1).toString(), new TypeReference<Employee>() {
		});

		model.addAttribute("buyInfos", productSalesOrderService.getSeleOrdeAndSetInfoById(salesOrder));

		model.addAttribute("salesOrder", salesOrder);

		model.addAttribute("uId", salesOrder.getPkUid());
		model.addAttribute("userName", employee.getEmpName());

		modelAndView.setViewName("admin/product/sales/info/update");
		return modelAndView;
	}

//	@RequiresPermissions("销售和详单添加")
	@RequestMapping("/info/add")
	public ModelAndView infoAdd(SalesOrder salesOrder, HttpServletRequest request, Model model,
			ListForm salesOrderInfos) {
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
			Product product = new Product();

			product.setPkPid(Long.parseLong(request.getParameter("getdata4")));
			modelAndView.addObject("setdata", productService.getProductById(product));
			return modelAndView;
		} else if (request.getParameter("getvip") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			Customer customer = new Customer();

			customer.setVipNo(request.getParameter("getvip"));
			customer = customerService.getCustomerByCardNo(customer);
			if (customer.getPkCid() != null) {
				modelAndView.addObject("setdata", customer.getPkCid());
			} else {
				modelAndView.addObject("setdata", -1);
			}
			return modelAndView;
		} else {
			if (salesOrder.getSalesOrderTime() != null) {

				if (productSalesOrderService.createSeleOrdeAndSetInfo(salesOrder,
						JSON.toJSONString(salesOrderInfos.getSalesOrderInfos())) == true) {

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

		modelAndView.setViewName("admin/product/sales/info/add");
		return modelAndView;
	}

//	@RequiresPermissions("销售和详单删除")
	@RequestMapping("/info/delete")
	public ModelAndView infoDelete(SalesOrderInfo salesOrderInfo) {
		ModelAndView modelAndView = new ModelAndView();
		if (productSalesOrderService.deleteBuyInfoByInfoId(salesOrderInfo) == true) {

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
