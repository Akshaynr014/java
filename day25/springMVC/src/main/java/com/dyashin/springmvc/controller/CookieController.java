
package com.dyashin.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cookie")
public class CookieController {
	@GetMapping("/getcookiespage")
	public String addCookie() {
		return "createCookie";
	}

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelMap) {
		Cookie cookie = new Cookie("name", "akshay");
		resp.addCookie(cookie);
		modelMap.addAttribute("msg", "MyCoolie added to the responce");
		return "createCookie";

	}

	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name = "name") String myCookieValue, ModelMap modelMap) {
		modelMap.addAttribute("msg", myCookieValue);
		return "createCookie";
	}
}