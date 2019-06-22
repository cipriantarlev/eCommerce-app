package com.shop.controller.homepages;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ForbiddenController {

	@GetMapping("/forbidden")
	public String forbidden(ModelMap modelMap) {
		return "forbidden";
	}
}
