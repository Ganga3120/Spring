package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context= new AnnotationConfigApplicationContext(Javaconfig.class);
  Patient patient=context.getBean("patient1",Patient.class);
      patient.details();
    }
}