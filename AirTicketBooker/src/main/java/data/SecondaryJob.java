package data;
public class SecondaryJob {
	String authenticating;
	 String status1 ,seats;
public void authenticate(String pwd) {
	
	if(pwd.equals("1998")) {
		String pass = "User is authenticated";
		 authenticating = "true";
	}
	else {
		String pass = "User is not  authenticated"; 		authenticating = "false";
	}
}
public void checkSeats(String num) {
	int total_seats = 50;  int avail= total_seats;
	int booked =Integer.parseInt(num); int total_booked = booked;
	if(authenticating.compareTo("true")==0) {
		if(avail>total_booked) {status1 = "YOu have booked"+total_booked+"seats";
		seats = "true";
		}
		else {
			status1 = "Seats are not available";
			seats = "false";
		}
	}
	
}
public void reward() {
	System.out.println("You have been authenticated and your seats have been booked");
}
}
