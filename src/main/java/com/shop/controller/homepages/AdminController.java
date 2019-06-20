package com.shop.controller.homepages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
