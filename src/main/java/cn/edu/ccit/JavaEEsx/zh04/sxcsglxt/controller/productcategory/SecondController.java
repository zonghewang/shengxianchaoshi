package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.productcategory;

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

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;

@Controller
@RequestMapping("/admin/productcategory/second")
public class SecondController {
	
	@Resource
	IProductCategoryService productCategoryService;
	
	@RequiresPermissions("二级分类管理")
	@RequestMapping("/show")
	public String show(Model model) {
		List<ProductCategory> firstProductCategorys = productCategoryService.getFirstCategory();
		Map<Long, String> firstProductCategoryMap = new HashMap<Long, String>();
		for (ProductCategory productCategory : firstProductCategorys) {
			firstProductCategoryMap.put(productCategory.getPkPcid(), productCategory.getProductCategoryName());
		}
		List<ProductCategory> secondProductCategorys = productCategoryService.getSecondCategory();
		model.addAttribute("firsts", firstProductCategoryMap);
		model.addAttribute("seconds", secondProductCategorys);
		return "admin/productcategory/second/show";
	}
	@RequiresPermissions("二级分类添加")
	@RequestMapping("/add")
	public ModelAndView add(Model model,ProductCategory productCategory) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());
		
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
				
		modelAndView.setViewName("admin/productcategory/second/add");
		return modelAndView;
	}
	@RequiresPermissions("二级分类删除")
	@RequestMapping("/delete")
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
	@RequiresPermissions("二级分类修改")
	@RequestMapping("/update")
	public ModelAndView update(ProductCategory productCategory,Model model,HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());
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
				
		modelAndView.setViewName("admin/productcategory/second/update");
		return modelAndView;
	} 
	

}
