package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
   ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
   System.out.println("*************");
     Person person= context.getBean("person1",Person.class);
          person.personinfo();
          System.out.println("*************");
     Person person1=context.getBean("p",Person.class);
       person1.personinfo();
      
    }
}
