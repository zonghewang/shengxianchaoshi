package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller.product;

import java.util.ArrayList;
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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Customer;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;

@Controller
@RequestMapping("/admin/product")
public class ProductShowController {
	
	@Resource
	IProductService productService;
	@Resource
	IProductCategoryService productCategoryService;
	
//	@RequiresPermissions("货物盘点")
	@RequestMapping("/show")
	public String show(Model model) {
		
		List<Product> products =JSON.parseObject(productService.getAllProduct().toString(), new TypeReference<List<Product>>() {}) ;

		model.addAttribute("products", products);
		
		List<ProductCategory> firstCategorys = productCategoryService.getFirstCategory();
		Map<Long, String> firstCategorysNameIndexMap = new HashMap<Long, String>();
		for (ProductCategory productCategory : firstCategorys) {
			firstCategorysNameIndexMap.put(productCategory.getPkPcid(),productCategory.getProductCategoryName());
		}
		
		List<ProductCategory> secondCategorys = productCategoryService.getSecondCategory();
		Map<Long, Long> secondCategorysIndexMap = new HashMap<Long, Long>();
		Map<Long, String> secondCategorysNameIndexMap = new HashMap<Long, String>();
		for (ProductCategory productCategory : secondCategorys) {
			secondCategorysIndexMap.put(productCategory.getPkPcid(), productCategory.getPid());
			secondCategorysNameIndexMap.put(productCategory.getPkPcid(), productCategory.getProductCategoryName());
		}
		List<ProductCategory> thirdCategorys = productCategoryService.getThirdCategory();
		Map<Long, Long> thirdCategorysIndexMap = new HashMap<Long, Long>();
		Map<Long, String> thirdCategorysNameIndexMap = new HashMap<Long, String>();
		for (ProductCategory productCategory : thirdCategorys) {
			thirdCategorysIndexMap.put(productCategory.getPkPcid(), productCategory.getPid());
			thirdCategorysNameIndexMap.put(productCategory.getPkPcid(), productCategory.getProductCategoryName());
		}
		
		model.addAttribute("firstCategorysNameIndex", firstCategorysNameIndexMap);
		model.addAttribute("secondCategorysIndex", secondCategorysIndexMap);
		model.addAttribute("secondCategorysNameIndex", secondCategorysNameIndexMap);
		model.addAttribute("thirdCategorysIndex", thirdCategorysIndexMap);
		model.addAttribute("thirdCategorysNameIndex", thirdCategorysNameIndexMap);
		
		return "admin/product/show";
	}

//	@RequiresPermissions("货物盘点修改")
	@RequestMapping("/update")
	public ModelAndView update(Product product, Model model, HttpServletRequest request) {
		ProductCategory productCategory = new ProductCategory();

		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		// System.out.println(supplierProduct.getSupplierName());
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
		}  else {
			if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

				if (productService.setProduct(product) == true) {

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

		model.addAttribute("product", productService.getProductById(product));
		modelAndView.setViewName("admin/product/update");
		return modelAndView;
		
	}

//	@RequiresPermissions("货物盘点添加")
	@RequestMapping("/add")
	public ModelAndView add(Product product,Model model,HttpServletRequest request) {
		ProductCategory productCategory = new ProductCategory();

		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		// System.out.println(supplierProduct.getSupplierName());
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
		}  else {
			if (product.getProductCategoryName() != null) {

				if (productService.setProduct(product) == true) {

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

		modelAndView.setViewName("admin/product/add");
		return modelAndView;
	}

//	@RequiresPermissions("货物盘点删除")
	@RequestMapping("/delete")
	public ModelAndView delete(Product product) {
		ModelAndView modelAndView = new ModelAndView();
		if (productService.deleteProductByPkPcid(product) == true) {

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
