package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller;

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

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Product;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.ProductCategory;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SupplierProduct;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductCategoryService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IProductService;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.ISupplierService;

@Controller
@RequestMapping("/admin/supplier")
public class SupplierController {

	@Resource
	ISupplierService supplierService;
	@Resource
	IProductCategoryService productCategoryService;
	@Resource
	IProductService productService;

	@RequestMapping("/add")
	@RequiresPermissions("供应商添加")
	public ModelAndView add(SupplierProduct supplierProduct, Model model,HttpServletRequest request) {

		ProductCategory productCategory = new ProductCategory();
		
		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		//System.out.println(supplierProduct.getSupplierName());
		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		}else if (request.getParameter("getdata2") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata2")));
			modelAndView.addObject("setdata", productCategoryService.getThirdUseSecond(productCategory));
			return modelAndView;
		}else if (request.getParameter("getdata3") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			Product product = new Product();
			product.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			modelAndView.addObject("setdata", productService.getProductByPkPcid(product));
			return modelAndView;
		}else {
			if (supplierProduct.getSupplierName() != null) {

				if (supplierService.createSupplierProduct(supplierProduct) == true) {

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

		modelAndView.setViewName("admin/supplier/add");
		return modelAndView;

	}

	@RequiresPermissions("供应商列表")
	@RequestMapping("/show")
	public String show(Model model) {
		
		List<Product> products = JSON.parseObject(productService.getAllProduct().toString(),new TypeReference<ArrayList<Product>>() {});
		
		Map<Long, String> ProductMap = new HashMap<Long, String>();
		for (Product product : products) {
			ProductMap.put(product.getPkPid(), product.getProductCategoryName());
			System.out.println( product.getProductCategoryName());
		}
		System.out.println(supplierService.getAllSupplierProduct());
		List<SupplierProduct> supplierProducts = JSON.parseObject(supplierService.getAllSupplierProduct().toString(), new TypeReference<ArrayList<SupplierProduct>>() {});
		
		model.addAttribute("products", ProductMap);
		
		model.addAttribute("supplierProducts", supplierProducts);
		return "admin/supplier/show";
	}

	@RequiresPermissions("供应商修改")
	@RequestMapping("/update")
	public ModelAndView update(SupplierProduct supplierProduct, Model model, HttpServletRequest request) {
		
		
		
		ProductCategory productCategory = new ProductCategory();
		
		model.addAttribute("firstProductCategorys", productCategoryService.getFirstCategory());

		ModelAndView modelAndView = new ModelAndView();
		//System.out.println(supplierProduct.getSupplierName());
		if (request.getParameter("getdata") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata")));
			modelAndView.addObject("setdata", productCategoryService.getSecondUseFirst(productCategory));
			return modelAndView;
		}else if (request.getParameter("getdata2") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata2")));
			modelAndView.addObject("setdata", productCategoryService.getThirdUseSecond(productCategory));
			return modelAndView;
		}else if (request.getParameter("getdata3") != null) {
			modelAndView.setView(new MappingJackson2JsonView());
			Product product = new Product();
			product.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			productCategory.setPkPcid(Long.parseLong(request.getParameter("getdata3")));
			modelAndView.addObject("setdata", productService.getProductByPkPcid(product));
			return modelAndView;
		}else {
			if (request.getParameter("methord") != null && request.getParameter("methord").equals("update")) {

				if (supplierService.updateSupplierProductById(supplierProduct) == true) {

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

		supplierProduct=supplierService.getSupplierProductById(supplierProduct);
		model.addAttribute("supplierProduct", supplierProduct);
		modelAndView.setViewName("admin/supplier/update");
		return modelAndView;
		
	}

	@RequiresPermissions("供应商删除")
	@RequestMapping("/delete")
	public ModelAndView delete(SupplierProduct supplierProduct) {
		ModelAndView modelAndView = new ModelAndView();
		if (supplierService.deleteSupplierProductById(supplierProduct) == true) {

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
