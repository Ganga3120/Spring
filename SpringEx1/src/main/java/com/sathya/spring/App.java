package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// start the container
      ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
      System.out.println("*******************");
      //get the objects from container
    Greetingimpl greetingimpl= context.getBean("greet",Greetingimpl.class);
    greetingimpl.greet();
       
     
    }
}
