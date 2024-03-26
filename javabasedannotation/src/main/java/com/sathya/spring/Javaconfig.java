package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Javaconfig {
@Bean
   public Person person1()
   {
	Person person=new Person();
	 person.setName("ganga");
	 person.setEmail("gangabhavanikps@gmail.com");
	   return person;
   }
@Bean(name="p")
public Person person2()
{
	Person person=new Person();
	 person.setName("prasad");
	 person.setEmail("yesukps@gmail.com");
	   return person;

}
}
