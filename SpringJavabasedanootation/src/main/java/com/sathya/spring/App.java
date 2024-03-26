package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
  Student student1=context.getBean("student",Student.class);
  student1.details();
    }
}
