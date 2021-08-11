package com.guru.training.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("SP")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGretting() {
        return "Hola Mundo!";
    }
}
