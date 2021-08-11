package com.guru.training.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGretting() {
        return "Hello World-Setter";
    }
}
