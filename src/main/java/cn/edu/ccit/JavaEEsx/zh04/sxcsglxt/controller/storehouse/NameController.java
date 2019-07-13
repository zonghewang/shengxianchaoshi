package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.storehouse;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Storehouse;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseNameService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IStorehouseService;

@Controller
@RequestMapping("/admin/storehouse/name")
public class NameController {

	@Resource
	IStorehouseNameService storehouseNameService;

	@RequiresPermissions("仓库添加")
	@RequestMapping("/add")
	public ModelAndView add(Storehouse storehouse) {
		ModelAndView modelAndView = new ModelAndView();

		if (storehouse.getStorehouseName() != null) {

			if (storehouseNameService.setStorehouseName(storehouse) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}

		}

		modelAndView.setViewName("admin/storehouse/name/add");
		return modelAndView;
	}

	@RequiresPermissions("仓库管理")
	@RequestMapping("/show")
	public String show(Model model) {
		List<Storehouse> storehouses = storehouseNameService.getAllStorehouse();

		model.addAttribute("storehouses", storehouses);

		return "admin/storehouse/name/show";
	}

	@RequiresPermissions("仓库更新")
	@RequestMapping("/update")
	public ModelAndView update(Storehouse storehouse, Model model, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		System.out.println(request.getParameter("methord"));

		if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

			if (storehouseNameService.updateStorehouseName(storehouse) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}

		} else {
			if (storehouse.getPkSid() != null) {
				model.addAttribute("storehouseName", storehouseNameService.getStorehouseNameById(storehouse));
			}
		}
		modelAndView.setViewName("admin/storehouse/name/update");
		return modelAndView;
	}

	@RequiresPermissions("仓库删除")
	@RequestMapping("/delete")
	public ModelAndView delete(Storehouse storehouse) {
		ModelAndView modelAndView = new ModelAndView();
		if (storehouseNameService.deleteStorehouseName(storehouse) == true) {

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
