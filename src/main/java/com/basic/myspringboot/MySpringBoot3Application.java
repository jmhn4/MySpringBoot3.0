package com.basic.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBoot3Application {

	public static void main(String[] args) {
		//SpringApplication.run(MySpringBoot3Application.class, args);
		SpringApplication application = new SpringApplication(MySpringBoot3Application.class);
		//Application Type변경
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}


}
