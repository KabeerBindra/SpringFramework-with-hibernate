package data;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
private BookingService bs;
@RequestMapping("/")
public String show(ModelMap mp)
{
	Passenger p = new Passenger();
	mp.addAttribute("Passenger", p);
	return "BookTickets";
	
}
@RequestMapping(method=RequestMethod.POST)
public String process(@ModelAttribute(value="Passenger") Passenger p , ModelMap m) {
m.addAttribute("hello",p.Hello() );	
	return "BookingConfirmed";
	
}
public BookingService getBs() {
	return bs;
}
public void setBs(BookingService bs) {
	this.bs = bs;
}




}
