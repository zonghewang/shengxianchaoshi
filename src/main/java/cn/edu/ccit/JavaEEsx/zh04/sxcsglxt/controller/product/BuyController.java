package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.ListCellRenderer;

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
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Customer;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Employee;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductBuyService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ISupplierService;

@Controller
@RequestMapping("/admin/product/buy")
public class BuyController {
	@Resource
	IProductBuyService productBuyService;
	@Resource
	IProductCategoryService productCategoryService;
	@Resource
	IProductService productService;
	@Resource
	ISupplierService supplierService;
	@Resource
	IEmployeeService employeeService;

//	@RequiresPermissions("采购管理")
	@RequestMapping("/show")
	public String show(Model model) {
		List<Buy> buys = productBuyService.getAllBuy();
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
		model.addAttribute("buys", buys);
		return "admin/product/buy/show";
	}

//	@RequiresPermissions("采购删除")
	@RequestMapping("/delete")
	public ModelAndView delete(Buy buy) {

		ModelAndView modelAndView = new ModelAndView();
		if (productBuyService.deleteBuy(buy) == true) {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "true");
			return modelAndView;

		} else {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "false");
			return modelAndView;

		}
	}

//	@RequiresPermissions("采购和详单管理")
	@RequestMapping("/buyandinfo/show")
	public String infoShow(Buy buy, Model model) {

		buy = productBuyService.getBuyByBid(buy);

		List<BuyInfo> buyInfos = productBuyService.getBuyAndSetBuyInfoByBid(buy);

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

		model.addAttribute("buy", buy);

		model.addAttribute("buyInfos", buyInfos);

		return "admin/product/buy/buyandinfo/show";
	}

//	@RequiresPermissions("采购和详单修改")
	@RequestMapping("/buyandinfo/update")
	public ModelAndView infoUpdate(Buy buy, HttpServletRequest request, Model model, ListForm buyInfos) {

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

				if (productBuyService.updateBuyAndSetBuyInfo(buy, JSON.toJSONString(buyInfos.getBuyInfos())) == true) {

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

		buy = productBuyService.getBuyByBid(buy);
		User user = new User();
		user.setPkUid(buy.getPkUid());

		List<Object> obj = JSON.parseObject(employeeService.getUserAndSetEmployeeRoleCategoryByUid(user).toString(),
				new TypeReference<List<Object>>() {
				});
		Employee employee = JSON.parseObject(obj.get(1).toString(),new TypeReference<Employee>() {
		});
		
		model.addAttribute("buyInfos", productBuyService.getBuyAndSetBuyInfoByBid(buy));
		
		model.addAttribute("buy", buy);
		
		model.addAttribute("uId", buy.getPkUid());
		model.addAttribute("userName", employee.getEmpName());

		modelAndView.setViewName("admin/product/buy/buyandinfo/update");
		return modelAndView;
	}

//	@RequiresPermissions("采购和详单添加")
	@RequestMapping("/buyandinfo/add")
	public ModelAndView infoAdd(Buy buy, HttpServletRequest request, Model model, ListForm buyInfos) {

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
			if (buy.getBuyName() != null) {

				if (productBuyService.createBuyAndSetBuyInfo(buy, JSON.toJSONString(buyInfos.getBuyInfos())) == true) {

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

		modelAndView.setViewName("admin/product/buy/buyandinfo/add");
		return modelAndView;
	}

//	@RequiresPermissions("采购和详单删除")
	@RequestMapping("/buyandinfo/delete")
	public ModelAndView infoDelete(BuyInfo buyInfo) {
		ModelAndView modelAndView = new ModelAndView();
		if (productBuyService.deleteBuyInfoByInfoId(buyInfo) == true) {

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
