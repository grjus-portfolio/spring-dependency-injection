package com.guru.training.springdependencyinjection;

import com.guru.training.springdependencyinjection.controllers.MyController;
import com.guru.training.springdependencyinjection.services.ConstructorInjectedController;
import com.guru.training.springdependencyinjection.services.PropertyInjectedController;
import com.guru.training.springdependencyinjection.services.SetterInjectedController;
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

		System.out.println("------PROPERTY");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------SETTER");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------CONSTRUCTOR");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
