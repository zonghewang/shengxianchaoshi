package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.productcategory;

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
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;

@Controller
@RequestMapping("/admin/productcategory/first")
public class FirstController {

	@Resource
	IProductCategoryService productCategoryService;

	@RequestMapping("/show")
	@RequiresPermissions("一级分类管理")
	public String show(Model model) {

		List<ProductCategory> productCategorys = productCategoryService.getFirstCategory();

		model.addAttribute("productCategorys", productCategorys);

		return "admin/productcategory/first/show";
	}

	@RequestMapping("/add")
	@RequiresPermissions("一级分类添加")
	public ModelAndView add(ProductCategory productCategory) {

		ModelAndView modelAndView = new ModelAndView();
		System.out.println(productCategory.getProductCategoryName());

		if (productCategory.getProductCategoryName() != null) {

			if (productCategoryService.setFirstCategory(productCategory) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}

		}

		modelAndView.setViewName("admin/productcategory/first/add");
		return modelAndView;
	}

	@RequestMapping("/delete")
	@RequiresPermissions("一级分类删除")
	public ModelAndView delete(ProductCategory productCategory) {
		ModelAndView modelAndView = new ModelAndView();
		if (productCategoryService.deleteCategory(productCategory) == true) {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "true");
			return modelAndView;

		} else {

			modelAndView.setView(new MappingJackson2JsonView());
			modelAndView.addObject("tips", "false");
			return modelAndView;

		}
	}

	@RequestMapping("/update")
	@RequiresPermissions("一级分类修改")
	public ModelAndView update(ProductCategory productCategory,Model model,HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println(request.getParameter("methord"));
		
		if(request.getParameter("methord")!= null&&request.getParameter("methord").equals("update")) {
			
			if (productCategoryService.updateCategory(productCategory) == true) {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "true");
				return modelAndView;

			} else {

				modelAndView.setView(new MappingJackson2JsonView());
				modelAndView.addObject("tips", "false");
				return modelAndView;

			}
			
			
		}else {
			if (productCategory.getPkPcid() != null) {
				model.addAttribute("productCategory", productCategoryService.getCategory(productCategory));
			}
		}
		modelAndView.setViewName("admin/productcategory/first/update");
		return modelAndView;
	}

}
