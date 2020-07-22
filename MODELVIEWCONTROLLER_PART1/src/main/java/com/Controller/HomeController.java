package com.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/showform")
	public String show() {
		return "menu";
	}
@RequestMapping("/process")
	public String process() {
		return "answer";
	}
@RequestMapping("/upper")
public String upper(HttpServletRequest req , ModelMap m) {
	// read the request parameter from the HTML form
			String theName = req.getParameter("name");
			
			// convert the data to all caps
			theName = theName.toUpperCase();
			
			// create the message
			String result = "Yo! " + theName;
			
			// add message to the model
			m.addAttribute("message", result);
					
	return "answer1";
	
	
}
}

