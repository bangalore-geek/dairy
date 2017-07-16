package com.dairy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartupController {

	@RequestMapping("/")
	public String loadIndex() {
		return "home";
	}

}
