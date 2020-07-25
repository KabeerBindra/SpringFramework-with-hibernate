package data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

@RequestMapping("/")
public String show(ModelMap mp)
{
	Passenger p = new Passenger();
	mp.addAttribute("Passenger", p);
	return "BookTickets";
	
}
@RequestMapping(method=RequestMethod.POST)
public String process(@ModelAttribute(value="Passenger") Passenger p , ModelMap m) {
//m.addAttribute("hello",p.Hello() );	
//	return "BookingConfirmed";
	ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
Interface in = (Interface) ctx.getBean("bookProxy");
in.book(p.getNum(), p.getPassword());
	m.addAttribute("hello", p.getNum());
	m.addAttribute("hello1", p.getPassword());
	return "BookingConfirmed";
	
}





}
