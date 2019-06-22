package com.shop.controller.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String showContactPage() {
		return "contactus";
	}

	@RequestMapping(value = "/home-contact", method = RequestMethod.GET)
	public String showContactHomePage() {
		return "contacthome";
	}
	
	@RequestMapping(value = "/contact-sent", method = RequestMethod.GET)
	public String showContactSentPage() {
		return "contactsent";
	}

	@RequestMapping(value = "/home-contact-sent", method = RequestMethod.GET)
	public String showHomeContactSentPage() {
		return "contactsenthome";
	}

	@RequestMapping(value = "/privacy", method = RequestMethod.GET)
	public String showPrivacyPage() {
		return "privacy";
	}

	@RequestMapping(value = "/home-privacy", method = RequestMethod.GET)
	public String showPrivacyHomePage() {
		return "privacyhome";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String showAboutPage() {
		return "aboutus";
	}

	@RequestMapping(value = "/home-about", method = RequestMethod.GET)
	public String showHomeAboutPage() {
		return "aboutushome";
	}

}
