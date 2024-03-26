package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {

 @Bean
 public Doctor doctor()
 {
	 Doctor doctor=new Doctor(1,"Dr.Sridhar");
	 return doctor;
	}
@Bean
public Pharmacy pharmacy()
{
	Pharmacy pharmacy=new Pharmacy("durga pharmacy","hyderaba");
	return pharmacy;
}
@Bean
public Patient patient1()
{
	Patient p=new Patient("Radha",30,doctor(),pharmacy());
	return p;
	
	}
}
