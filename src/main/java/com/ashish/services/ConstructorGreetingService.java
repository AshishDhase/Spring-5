package com.ashish.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    private final String HELLO_GURUS = "Hello from ConstructorGreetingService";
    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
