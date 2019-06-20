package com.shop.controller.homepages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageCheckOutController {

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String showCheckOutage() {
		return "checkout";
	}

	@RequestMapping(value = "/checkoutsuccess", method = RequestMethod.GET)
	public String showCheckOuSPage() {
		return "checkoutsuccess";
	}
}
