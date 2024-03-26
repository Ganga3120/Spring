package com.sathya.spring.Demoproject2;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
@Component
public class Homeloan {

	public void loanInfo()
	{
		System.out.println("welcome to homeloan service");
	}
}
