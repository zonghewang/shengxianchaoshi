package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IEmployeeService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IIndexService;

@Controller
@RequestMapping("/admin")
public class IndexController {
	
	@Resource
	IIndexService indexService;
	
	@RequestMapping("/indexShow")
	@RequiresPermissions("首页展示")
	public String indexShow(Model model){
		
		model.addAttribute("customerNum", indexService.getCustomerNum());
		model.addAttribute("employeeNum", indexService.getEmployeeNum());
		model.addAttribute("productNum", indexService.getProductNum());
		model.addAttribute("pricesNum", indexService.getPrices());
		
		return "admin/indexShow";
	}
	
	@RequestMapping("/index")
	@RequiresPermissions("首页")
	 public String index(Model model){
		
		model.addAttribute("userName", indexService.getUserName());
		
		model.addAttribute("roleName", indexService.getRole(indexService.getUId()).get(0).getRoleName());
		
			return "admin/index";
		}
	
}
