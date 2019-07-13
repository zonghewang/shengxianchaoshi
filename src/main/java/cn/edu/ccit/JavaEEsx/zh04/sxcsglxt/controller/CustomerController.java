package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller;

import java.util.ArrayList;
import java.util.List;

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

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Customer;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ICustomerService;

@Controller
@RequestMapping("/admin/customer")
public class CustomerController {
	@Resource
	ICustomerService customerService;

	@RequiresPermissions("会员添加")
	@RequestMapping("/add")
	public ModelAndView add(Customer customer) {
		ModelAndView modelAndView = new ModelAndView();

		if (customer.getCustomerName() != null) {

			if (customerService.createCustomer(customer) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}

		}

		modelAndView.setViewName("admin/customer/add");
		return modelAndView;
	}

	@RequiresPermissions("会员列表")
	@RequestMapping("/show")
	public String show(Model model) {
		List<Customer> customers = JSON.parseObject(customerService.getAllCustomer().toString(),
				new TypeReference<ArrayList<Customer>>() {
				});

		model.addAttribute("customers", customers);
		return "admin/customer/show";
	}

	@RequiresPermissions("会员修改")
	@RequestMapping("/update")
	public ModelAndView update(Customer customer,Model model,HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		System.out.println(request.getParameter("methord"));

		if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

			if (customerService.updateCustomer(customer) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}

		} else {
			if (customer.getPkCid() != null) {
				model.addAttribute("customer", customerService.getCustomerById(customer));
			}
		}
		modelAndView.setViewName("admin/customer/update");
		return modelAndView;
	}

	@RequiresPermissions("会员删除")
	@RequestMapping("/delete")
	public ModelAndView delete(Customer customer) {
		ModelAndView modelAndView = new ModelAndView();
		if (customerService.deleteCustomer(customer) == true) {

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
