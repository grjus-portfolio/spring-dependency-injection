package com.guru.training.springdependencyinjection.services;

import com.guru.training.springdependencyinjection.controllers.ConstructorInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;


    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController( new ConstructorGreetingService());
    }
    @Test
    void name() {
        System.out.println(controller.getGreeting());
    }


}