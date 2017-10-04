package com.shareen.img.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {

	@RequestMapping(value="contact-us" )
	public String showContactUsPage() {
		return "contact-us";
	}
}
