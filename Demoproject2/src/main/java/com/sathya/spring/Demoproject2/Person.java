package com.sathya.spring.Demoproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class Person {
@Autowired
	private Homeloan homeloan;
@Autowired
	private ReaslestateService reaslestateService;
	/*@Autowired
	public Person(Homeloan homeloan, ReaslestateService reaslestateService) {
		super();
		this.homeloan = homeloan;
		this.reaslestateService = reaslestateService;
	}*/
	
	 public void info()
	 {
		 homeloan.loanInfo();
		 reaslestateService.realstateinfo();
	 }

	/*public Homeloan getHomeloan() {
		return homeloan;
	}
 @Autowired
	public void setHomeloan(Homeloan homeloan) {
		this.homeloan = homeloan;
	}

	public ReaslestateService getReaslestateService() {
		return reaslestateService;
	}
@Autowired
	public void setReaslestateService(ReaslestateService reaslestateService) {
		this.reaslestateService = reaslestateService;
	}*/
}
