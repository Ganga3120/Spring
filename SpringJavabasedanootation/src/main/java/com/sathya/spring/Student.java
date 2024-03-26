package com.sathya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
private EmailmessageService emailmessageService;
	@Autowired
private JavacourseService javacourseService;
/*@Autowired
public Student(EmailmessageService emailmessageService, JavacourseService javacourseService) {
	super();
	this.emailmessageService = emailmessageService;
	this.javacourseService = javacourseService;
}*/


/*public EmailmessageService getEmailmessageService() {
	return emailmessageService;
}

@Autowired
public void setEmailmessageService(EmailmessageService emailmessageService) {
	this.emailmessageService = emailmessageService;
}


public JavacourseService getJavacourseService() {
	return javacourseService;
}

@Autowired
public void setJavacourseService(JavacourseService javacourseService) {
	this.javacourseService = javacourseService;
}*/
public void details()
{
	emailmessageService.message();
	javacourseService.courseInfo();
}

}
