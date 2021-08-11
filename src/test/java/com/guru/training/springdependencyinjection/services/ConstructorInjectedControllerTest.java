package com.guru.training.springdependencyinjection.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;


    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController( new GreetingServiceImpl());
    }
    @Test
    void name() {
        System.out.println(controller.getGreeting());
    }


}