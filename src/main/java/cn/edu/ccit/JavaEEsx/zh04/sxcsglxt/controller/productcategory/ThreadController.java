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
@RequestMapping("/admin/productcategory/thread")
public class ThreadController {
	@Resource
	IProductCategoryService productCategoryService;

	@RequiresPermissions("三级分类管理")
	@RequestMapping("/show")
	public String show(Model model) {
		List<ProductCategory> firstProductCategorys = productCategoryService.getFirstCategory();
		Map<Long, String> firstProductCategoryMap = new HashMap<Long, String>();
		for (ProductCategory productCategory : firstProductCategorys) {
			firstProductCategoryMap.put(productCategory.getPkPcid(), productCategory.getProductCategoryName());
		}
		List<ProductCategory> secondProductCategorys = productCategoryService.getSecondCategory();
		Map<Long, String> secondProductCategoryMap = new HashMap<Long, String>();
		Map<Long, Long> secondProductCategoryFindFirstMap = new HashMap<Long, Long>();
		for (ProductCategory productCategory : secondProductCategorys) {
			secondProductCategoryMap.put(productCategory.getPkPcid(), productCategory.getProductCategoryName());
			secondProductCategoryFindFirstMap.put(productCategory.getPkPcid(), productCategory.getPid());
		}
		List<ProductCategory> threadProductCategorys = productCategoryService.getThirdCategory();
		model.addAttribute("firsts", firstProductCategoryMap);
		model.addAttribute("seconds", secondProductCategoryMap);
		model.addAttribute("firstindex", secondProductCategoryFindFirstMap);
		model.addAttribute("threads", threadProductCategorys);
		return "admin/productcategory/thread/show";
	}

	@RequiresPermissions("三级分类添加")
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, Model model, ProductCategory productCategory) {

		ModelAndView modelAndView = new ModelAndView();

		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		System.out.println(productCategory.getProductCategoryName());

		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		} else {
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

		}
		modelAndView.setViewName("admin/productcategory/thread/add");
		return modelAndView;
	}

	@RequiresPermissions("三级分类删除")
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

	@RequiresPermissions("三级分类修改")
	@RequestMapping("/update")
	public ModelAndView update(ProductCategory productCategory, Model model, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());
		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		} else {

			if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

				if (productCategoryService.updateCategory(productCategory) == true) {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "true");
					return modelAndView;

				} else {

					modelAndView.setView(new MappingJackson2JsonView());
					modelAndView.addObject("tips", "false");
					return modelAndView;

				}

			} else {
				if (productCategory.getPkPcid() != null) {
					model.addAttribute("productCategory", productCategoryService.getCategory(productCategory));
				}
			}
		}
		productCategory = productCategoryService.getCategory(productCategory);

		ProductCategory pproductCategory = new ProductCategory();
		pproductCategory.setPkPcid(productCategory.getPid());
		pproductCategory = productCategoryService.getCategory(pproductCategory);
		model.addAttribute("pproductCategory", pproductCategory);

		ProductCategory ppproductCategory = new ProductCategory();
		ppproductCategory.setPkPcid(pproductCategory.getPid());
		ppproductCategory = productCategoryService.getCategory(ppproductCategory);

		model.addAttribute("secondProductCategorys", productCategoryService.getSecondUseFirst(ppproductCategory));
		modelAndView.setViewName("admin/productcategory/thread/update");
		return modelAndView;
	}

}
