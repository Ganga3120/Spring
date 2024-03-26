package com.sathya.spring;

import org.springframework.stereotype.Component;

@Component
public class EmailmessageService implements MessageService {

	@Override
	public void message() {
System.out.println("here your email gets messages");
System.out.println("you will get updates");
	}

}
