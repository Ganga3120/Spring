package com.sathya.spring;

public class Traveller {
private String name;
private long mobile;
private String email;
Vehicle vehicle;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
public void startJourney()
{
	System.out.println("HEY...."+name+"   WELCOME TO TRAVELLING   ");
	System.out.println("CHECK YOUR MOBILE NUMBER  "+mobile+"  AND EMAIL ID  "+email);
	  vehicle.move();
}
}
