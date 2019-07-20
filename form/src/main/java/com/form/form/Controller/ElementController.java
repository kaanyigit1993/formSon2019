package com.form.form.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.form.form.Business.ElementService;
import com.form.form.JPAEntities.Element;

@Controller
public class ElementController {

	@Autowired
	private ElementService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model)
	{
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewElement(Model model)
	{
		Element element = new Element();
		model.addAttribute("element",element);
		return "new_element";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveElement(@ModelAttribute("element")Element element)
	{
	service.save(element);
	return "redirect:/new";
	}
	
}
