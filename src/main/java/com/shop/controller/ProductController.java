package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
//
//	@Autowired
//	private ProductService service;
//
//	@GetMapping
//	public List<Product> getProductsByType(@RequestParam("type") String type) {
//		return service.getProductsByType(ProductType.valueOf(type));
//	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String showLoginPage() {
		return "products";
	}
}
