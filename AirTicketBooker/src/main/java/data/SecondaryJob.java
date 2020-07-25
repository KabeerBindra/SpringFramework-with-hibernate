package data;
public class SecondaryJob {
	String authenticating;
	 String status1 ,seats;
public void authenticate(String pwd) {
	
	if(pwd.equals("karan")) {
		String pass = "User is authenticated";
		 authenticating = "true";
			System.out.println("authenticated");
	}
	else {
		String pass = "User is not  authenticated"; 		authenticating = "false";
		System.out.println(" Not authenticated");
	}
}
public void checkSeats(String num) {
	int total_seats = 50;  int avail= total_seats;
	int booked =Integer.parseInt(num); int total_booked = booked;
	if(authenticating.compareTo("true")==0) {
		if(avail>total_booked) {status1 = "YOu have booked"+total_booked+"seats";
		seats = "true";
		System.out.println(status1);
		}
	}
		else {
			status1 = "Seats are not available";
			seats = "false";
			System.out.println(" Not authenticated"+status1);
		}
	
	
}
public void reward() {
	System.out.println("We appreciate you visiting our website");
}
}
