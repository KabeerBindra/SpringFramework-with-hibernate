package data;

public class Passenger implements Interface {
private String num;
private String password;
public Passenger() {
	super();
}
public Passenger(String num, String password) {
	super();
	this.num = num;
	this.password = password;
}
@Override
public String toString() {
	return "Passenger [num=" + num + ", password=" + password + "]";
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
//public String Hello() {
//	return "Congratualation  The tickets have booked for \t  "+  num + " \t of travellers";
//	
@Override
public void book(String num, String password) {
	System.out.println("Congratualation your tickets have been booked and your password is  \t"+ num  +"\t"+  password);
	
}
	

}
