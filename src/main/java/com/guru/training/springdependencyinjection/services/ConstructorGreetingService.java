package com.guru.training.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGretting() {
        return "Hello World - Constructor";
    }
}
