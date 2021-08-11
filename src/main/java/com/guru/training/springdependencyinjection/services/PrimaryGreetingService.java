package com.guru.training.springdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGretting() {
        return "Hello World from the PRIMARY BEAM";
    }
}
