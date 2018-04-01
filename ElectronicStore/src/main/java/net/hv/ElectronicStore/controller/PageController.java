package net.hv.ElectronicStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*initially errors are thrown as eclipse does not know where to find controller
and requestmapping (annotations) and modelandview so press Ctrl+Shift+O to import relevant
packages*/

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	/*@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	@RequestMapping(value = {"/login"})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Login");
		mv.addObject("userClickLogin", true);
		return mv;
	}
	
	@RequestMapping(value = {"/checkout"})
	public ModelAndView checkout() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "CheckOut");
		mv.addObject("userClickCheckOut", true);
		return mv;
	}
	
	@RequestMapping(value = {"/cart"})
	public ModelAndView cart() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Cart");
		mv.addObject("userClickCart", true);
		return mv;
	}
	
	@RequestMapping(value = {"/lenevo"})
	public ModelAndView lenevo() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Lenevo");
		mv.addObject("userClickLenevo", true);
		return mv;
	}
	
	@RequestMapping(value = {"/dell"})
	public ModelAndView dell() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Dell");
		mv.addObject("userClickDell", true);
		return mv;
	}*/
}
