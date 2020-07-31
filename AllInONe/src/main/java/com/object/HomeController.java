package com.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@Autowired
   
	
	private DaoImplement dao;
	
	@ModelAttribute
	public void modelData(Model m) 
	{
	m.addAttribute("name","Kabeers");
	}
	
	/*
	 * @RequestMapping(value="/",method=RequestMethod.GET)
	 * 
	 * public String home() { return "index"; }
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	/* @GetMapping("/getKabeers") */
	public String get(Model m)
	{ 
		m.addAttribute("result", dao.getKabeers());
	System.out.println("answer is \n "+ dao.getKabeers());
return "result";
		
	}
}
