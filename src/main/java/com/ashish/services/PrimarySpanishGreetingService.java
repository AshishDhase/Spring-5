package com.ashish.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hola del servicio de saludo español";
    }
}
