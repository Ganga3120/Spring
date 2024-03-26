package com.sathya.spring;

import org.springframework.stereotype.Component;

@Component
public class JavaCourse  implements JavacourseService{

	@Override
	public void courseInfo() {
System.out.println("list of courses are JAVA,ADV JAVA,ORACLE,SPRING");		
	}	

}
