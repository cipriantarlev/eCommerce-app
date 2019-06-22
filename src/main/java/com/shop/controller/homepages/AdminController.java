package com.shop.controller.homepages;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.service.ProductService;

@Controller
public class AdminController {

	@Autowired
	private ProductService service;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", service.getAllProducts());
		return "admin";
	}

	@RequestMapping(value = "/delete-product")
	public String deleteProduct(@RequestParam String id, HttpServletRequest request) {
		service.deleteProductDTO(id);
		request.setAttribute("products", service.getAllProducts());
		return "admin";
	}

	@RequestMapping(value = "/update-product")
	public String updateProduct(HttpServletRequest request) {

		request.setAttribute("products", service.getAllProducts());
		return "admin";
	}

	@GetMapping(value = "/save-product")
	public String saveProduct(HttpServletRequest request) {

		request.setAttribute("products", service.getAllProducts());
		return "admin";
	}
}
