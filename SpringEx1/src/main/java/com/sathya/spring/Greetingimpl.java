package com.sathya.spring;

public class Greetingimpl  implements Greeting
{
	 public Greetingimpl() 
	 {
    	 System.out.println("object created successfully");
	}
	@Override
	public void greet() 
	{
    System.out.println("welcome Spring class");	
	}
     public void read()
     {
    	 System.out.println("classes are good");
     }
}

