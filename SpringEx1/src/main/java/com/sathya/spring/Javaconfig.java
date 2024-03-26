package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
 
	@Bean
	public  Greetingimpl greet()
	{
		Greetingimpl greetingimpl=new Greetingimpl();
		 return greetingimpl;
	}
}

