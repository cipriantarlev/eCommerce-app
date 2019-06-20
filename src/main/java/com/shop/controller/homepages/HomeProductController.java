package com.shop.controller.homepages;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.service.ProductService;


@Controller
@RequestMapping(value = "product")
public class HomeProductController {

	@Autowired
	private ProductService service;
//
//	@GetMapping
//	public List<Product> getProductsByType(@RequestParam("type") String type) {
//		return service.getProductsByType(ProductType.valueOf(type));
//	}

//	@RequestMapping(value = "/homepage-products", method = RequestMethod.GET)
//	public String showHomeproductsPage() {
//		return "homeProducts";
//	}


//	@GetMapping("/homepage-products")
//	public String listAllProducts(ModelMap model) {
//		List<ProductDTO> allProducts = service.getAllProducts();
//		model.put("products", allProducts);
//		return "homeProducts";

//	@RequestMapping(method = RequestMethod.GET)
//	public String listAllProducts(ModelMap model) {
//		List<ProductDTO> allProducts = service.getAllProducts();
//		model.put("products", allProducts);
//		return "product/index";

//	}

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", service.getAllProducts());
		return "product/index";
	}
}
