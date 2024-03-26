package com.sathya.spring;

public class Person {
 
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 public void personinfo()
	 {
		 System.out.println("hey.."+name+"welcome to spring classes");
		 System.out.println("your email id.."+email+"gives you updates");
	 }
	public Person() {
		System.out.println("object created successfully");
 	}
	
}
