package com.dyashin.springmvc.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	@GetMapping("/hello")
	public ModelAndView display() {
		ModelAndView view = new ModelAndView();
		view.setViewName("hellomvc");
		return view;
	}
}
