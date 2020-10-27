package com.unla.ignaciospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.ignaciospring.helpers.ViewRouteHelper;
import com.unla.ignaciospring.models.Degree;

@Controller
@RequestMapping("/")
public class HomeController {
	// GET example: SERVER/index
	@GetMapping("/index")
	public String index() {
		return ViewRouteHelper.INDEX;
	}

	// GET example: SERVER/hello?name=someName
	@GetMapping("/hello")
	public ModelAndView helloParams1(@RequestParam(name="name", required=false, defaultValue="null") String name) {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.HELLO);
		mV.addObject("name", name);
		return mV;
	}
	
	// GET example: SERVER/hello/somename
	@GetMapping("/hello/{name}")
	public ModelAndView helloParams2(@PathVariable("name") String name) {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.HELLO);
		mV.addObject("name", name);
		return mV;
	}

	@GetMapping("/")
	public RedirectView redirectToHomeIndex() {
		return new RedirectView(ViewRouteHelper.ROUTE_INDEX);
	}
	
	@GetMapping("/degree")
	public String degree(Model model) {
		model.addAttribute("degree", new Degree());
		return ViewRouteHelper.DEGREE;
	}
	
	@PostMapping("/newdegree")
	public ModelAndView newdegree(@ModelAttribute("degree") Degree degree) {
		ModelAndView mV= new ModelAndView();
		mV.setViewName(ViewRouteHelper.NEW_DEGREE);
		mV.addObject("degree",degree);
		return mV;
	}

}
