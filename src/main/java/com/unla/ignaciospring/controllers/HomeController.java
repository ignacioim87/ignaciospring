package com.unla.ignaciospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class HomeController {
	// GET example: SERVER/index
	@GetMapping("/index")
	public String index() {
		return "home/index";
	}

	// GET example: SERVER/hello?name=someName
	@GetMapping("/hello")
	public ModelAndView helloparams1(@RequestParam(name="name", required=false, defaultValue="null") String name) {
		ModelAndView mV = new ModelAndView("home/hello");
		mV.addObject("name", name);
		return mV;
	}

	// GET example: SERVER/hello/somename
	@GetMapping("/hello/{name}")
	public ModelAndView helloparams2(@PathVariable("name") String name) {
		ModelAndView mV = new ModelAndView("home/hello");
		mV.addObject("name", name);
		return mV;
	}

	@GetMapping("/")
	public RedirectView redirectToHomeIndex() {
		return new RedirectView("home/index");
	}

}
