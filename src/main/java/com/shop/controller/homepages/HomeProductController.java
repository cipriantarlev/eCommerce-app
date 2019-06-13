package com.shop.controller.homepages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeProductController {
//
//	@Autowired
//	private ProductService service;
//
//	@GetMapping
//	public List<Product> getProductsByType(@RequestParam("type") String type) {
//		return service.getProductsByType(ProductType.valueOf(type));
//	}

	@RequestMapping(value = "/homepage-products", method = RequestMethod.GET)
	public String showHomeproductsPage() {
		return "homeProducts";
	}
}
