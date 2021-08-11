package com.guru.training.springdependencyinjection;

import com.guru.training.springdependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.helloWorld();
		System.out.println(greeting);

	}

}
