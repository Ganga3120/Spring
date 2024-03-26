package com.sathya.spring;

public class Doctor {
 private int id;
 private String name;
public Doctor(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public void info()
{
	System.out.println("doctor id"+id+" name"+name);
}
 
 
}
