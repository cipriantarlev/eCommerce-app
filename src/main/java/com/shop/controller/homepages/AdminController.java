package com.shop.controller.homepages;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.domain.model.ProductDTO;
import com.shop.service.ProductService;

@Controller
public class AdminController {

	@Autowired
	private ProductService service;

	@GetMapping(value = "/admin")
	public String index(ModelMap modelMap) {
		modelMap.put("products", service.getAllProducts());
		return "admin";
	}

	@RequestMapping(value = "/delete-product") ///
	public String deleteProduct(@RequestParam String id, HttpServletRequest request) {
		service.deleteProductDTO(id);
		request.setAttribute("products", service.getAllProducts());
		return "admin";
	}
	
	@GetMapping(value = "/update-product")
	public String editProduct(ModelMap model, @RequestParam String id) {
		ProductDTO productsDTOById = service.getProductsById(id);
		model.addAttribute("product", productsDTOById);
		return "updateProduct";
	}

	@GetMapping(value = "/add-product")
	public String addProduct(ModelMap model) {
		ProductDTO productDTO = ProductDTO.builder()
										  .name("")
										  .price("")
										  .type("")
										  .stoc(0)
										  .build();
		model.addAttribute("product", productDTO);
		return "addProduct";
	}


	@PostMapping("/create-product")
	public String createProduct(ModelMap model, ProductDTO productDTO) {
		service.createProduct(productDTO);
		return "redirect:/admin";
	}
}
