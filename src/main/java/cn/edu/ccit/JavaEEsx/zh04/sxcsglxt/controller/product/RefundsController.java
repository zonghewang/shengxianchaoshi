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
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Buy;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Employee;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Refunds;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrder;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductRefundsService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ISupplierService;

@Controller
@RequestMapping("/admin/product/refunds")
public class RefundsController {
	@Resource
	IProductRefundsService productRefundsService;
	@Resource
	IProductCategoryService productCategoryService;
	@Resource
	ISupplierService supplierService;
	@Resource
	IProductService productService;
	@Resource
	IEmployeeService  employeeService;

//	@RequiresPermissions("退货管理")
	@RequestMapping("/show")
	public String show(Model model) {
		List<Refunds> refunds = productRefundsService.getAllRefunds();
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
		model.addAttribute("refunds", refunds);
		return "admin/product/refunds/show";
	}

//	@RequiresPermissions("退货删除")
	@RequestMapping("/delete")
	public ModelAndView delete(Refunds refunds) {
		ModelAndView modelAndView = new ModelAndView();
		if (productRefundsService.deleteRefunds(refunds) == true) {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "true");
			return modelAndView;

		} else {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "false");
			return modelAndView;

		}

	}

//	@RequiresPermissions("退货和详单管理")
	@RequestMapping("/info/show")
	public String infoShow(Refunds refunds, Model model) {
		refunds = productRefundsService.getRefundsByRid(refunds);

		List<RefundsInfo> refundsInfos = productRefundsService.getBuyAndSetBuyInfoByRid(refunds);

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

		model.addAttribute("refunds", refunds);

		model.addAttribute("refundsInfos", refundsInfos);
		return "admin/product/refunds/info/show";
	}

//	@RequiresPermissions("退货和详单修改")
	@RequestMapping("/info/update")
	public ModelAndView infoUpdate(Refunds refunds, HttpServletRequest request, Model model, ListForm refundsInfos) {
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

				if (productRefundsService.updateRefundsAndSetInfo(refunds, JSON.toJSONString(refundsInfos.getBuyInfos())) == true) {

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

		refunds = productRefundsService.getRefundsByRid(refunds);
		User user = new User();
		user.setPkUid(refunds.getPkUid());

		List<Object> obj = JSON.parseObject(employeeService.getUserAndSetEmployeeRoleCategoryByUid(user).toString(),
				new TypeReference<List<Object>>() {
				});
		Employee employee = JSON.parseObject(obj.get(1).toString(),new TypeReference<Employee>() {
		});
		
		model.addAttribute("refundsInfos", productRefundsService.getRefundsAndSetInfoById(refunds));
		
		model.addAttribute("refunds", refunds);
		
		model.addAttribute("uId", refunds.getPkUid());
		model.addAttribute("userName", employee.getEmpName());

		modelAndView.setViewName("admin/product/refunds/info/update");
		return modelAndView;
	}

//	@RequiresPermissions("退货和详单添加")
	@RequestMapping("/info/add")
	public ModelAndView infoAdd(Refunds refunds, HttpServletRequest request, Model model, ListForm refundsInfos) {
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
			if (refunds.getRefundsResult() != null) {

				if (productRefundsService.createRefundsAndSetInfo(refunds, JSON.toJSONString(refundsInfos.getRefundsInfos())) == true) {

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

		modelAndView.setViewName("admin/product/refunds/info/add");
		return modelAndView;
	}

//	@RequiresPermissions("退货和详单删除")
	@RequestMapping("/info/delete")
	public ModelAndView infoDelete(RefundsInfo refundsInfo) {
		ModelAndView modelAndView = new ModelAndView();
		if (productRefundsService.deleteRefundsInfoByInfoId(refundsInfo) == true) {

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
