package com.guru.training.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGretting() {
        return "Hello World";
    }
}
