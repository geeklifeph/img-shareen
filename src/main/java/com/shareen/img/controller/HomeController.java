package com.shareen.img.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String showHomePage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "home";
	}
}
