package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.json.Json;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao.EmployeeMapper;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Employee;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.EmployeeProductCategoryExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Role;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRole;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.UserRoleExample;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IUserService;

@Controller
@RequestMapping("/admin/user")
public class UserController {
	@Resource
	IEmployeeService employeeService;
	@Resource
	IProductService productService;

	@RequiresPermissions("用户添加")
	@RequestMapping("/add")
	public ModelAndView add(Model model, Employee employee, User user, UserRole userRole) {
		ModelAndView modelAndView = new ModelAndView();

		if (user.getUserPassword() != null) {

			if (employeeService.createUserAndSetEmployeeRoleCategory(user, employee, userRole, null) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}
		}
		model.addAttribute("roles", employeeService.getAllRole());
		modelAndView.setViewName("admin/user/add");
		return modelAndView;
	}

	@RequiresPermissions("用户列表")
	@RequestMapping("/show")
	public String show(Model model) {
		List<Object> objects = JSON.parseObject(employeeService.getAllUserAndSetEmployeeRoleCategory().toString(),
				new TypeReference<ArrayList<Object>>() {
				});
		List<User> users = JSON.parseObject(objects.get(0).toString(), new TypeReference<ArrayList<User>>() {
		});
		List<Employee> employees = JSON.parseObject(objects.get(1).toString(),
				new TypeReference<ArrayList<Employee>>() {
				});
		List<UserRole> roles = JSON.parseObject(objects.get(2).toString(), new TypeReference<ArrayList<UserRole>>() {
		});
		List<EmployeeProductCategory> categorys = JSON.parseObject(objects.get(3).toString(),
				new TypeReference<ArrayList<EmployeeProductCategory>>() {
				});

		Map<Long, String> usersMap = new HashMap<Long, String>();
		for (User user : users) {
			usersMap.put(user.getPkUid(), user.getUserName());
		}

		Map<Long, Long> userRolesMap = new HashMap<Long, Long>();
		for (UserRole role : roles) {
			userRolesMap.put(role.getPkUid(), role.getPkRid());
		}

		Map<Long, String> rolesMap = new HashMap<Long, String>();
		for (Role role : employeeService.getAllRole()) {
			rolesMap.put(role.getPkRid(), role.getRoleName());
		}

		Map<Long, Long> categorysMap = new HashMap<Long, Long>();
		for (EmployeeProductCategory category : categorys) {
			categorysMap.put(category.getPkUid(), category.getPkPcid());
		}

		Map<Long, String> productsMap = new HashMap<Long, String>();
		for (Product product : JSON.parseObject(productService.getAllProduct().toString(),
				new TypeReference<List<Product>>() {
				})) {
			productsMap.put(product.getPkPid(), product.getProductCategoryName());
		}

		model.addAttribute("employees", employees);
		model.addAttribute("users", usersMap);
		model.addAttribute("userRoles", userRolesMap);
		model.addAttribute("roles", rolesMap);
		model.addAttribute("categorys", categorysMap);
		model.addAttribute("products", productsMap);

		return "admin/user/show";
	}

	@RequiresPermissions("用户修改")
	@RequestMapping("/update")
	public ModelAndView update(EmployeeProductCategory category, Employee employee, User user, UserRole userRole,
			Model model, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		System.out.println(request.getParameter("methord"));

		if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

			if (employeeService.updateUserAndSetEmployeeRoleCategoryByUId(user, employee, userRole, category) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}

		} else {
			if (user.getPkUid() != null) {
				List<Object> objs = JSON.parseObject(
						employeeService.getUserAndSetEmployeeRoleCategoryByUid(user).toString(),
						new TypeReference<List<Object>>() {
						});
				user = JSON.parseObject(objs.get(0).toString(), new TypeReference<User>() {
				});
				employee = JSON.parseObject(objs.get(1).toString(), new TypeReference<Employee>() {
				});
				userRole = JSON.parseObject(objs.get(2).toString(), new TypeReference<UserRole>() {
				});
	
				category = objs.get(3)!=null?JSON.parseObject(objs.get(3).toString(),
								new TypeReference<EmployeeProductCategory>() {
								}):null;

				model.addAttribute("user", user);
				model.addAttribute("employee", employee);
				model.addAttribute("userRole", userRole);
				model.addAttribute("roles", employeeService.getAllRole());
				model.addAttribute("category", category);
			}
		}
		modelAndView.setViewName("admin/user/update");
		return modelAndView;
	}

	@RequiresPermissions("用户删除")
	@RequestMapping("/delete")
	public ModelAndView delete(User user) {

		ModelAndView modelAndView = new ModelAndView();
		if (employeeService.deleteUserAndSetEmployeeRoleCategoryByUid(user) == true) {

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
