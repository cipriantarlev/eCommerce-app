package com.shop.controller.welcome;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.domain.model.ProductDTO;
import com.shop.service.ProductService;

@Controller
public class ProductController {
//
	@Autowired
	private ProductService service;
//
//	@GetMapping
//	public List<Product> getProductsByType(@RequestParam("type") String type) {
//		return service.getProductsByType(ProductType.valueOf(type));
//	}

//	@RequestMapping(value = "/products", method = RequestMethod.GET)
//	public String showProductsPage() {
//		return "products";
//	}

	@GetMapping("/products")
	public String listAllProducts(ModelMap model) {
		List<ProductDTO> allProducts = service.getAllProducts();
		model.put("products", allProducts);
		return "products";
	}
}
