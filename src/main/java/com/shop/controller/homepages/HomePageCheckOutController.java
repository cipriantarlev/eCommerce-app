package com.shop.controller.homepages;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.domain.model.Item;

@Controller
public class HomePageCheckOutController {

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String reset(HttpSession session) {
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		cart.clear();
		session.setAttribute("cart", cart);
		return "checkout";
	}

	@RequestMapping(value = "/checkoutsuccess", method = RequestMethod.GET)
	public String showCheckOuSPage() {
		return "checkoutsuccess";
	}
}
