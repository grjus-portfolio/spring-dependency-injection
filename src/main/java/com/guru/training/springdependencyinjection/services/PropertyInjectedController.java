package com.guru.training.springdependencyinjection.services;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGretting();
    }

}
