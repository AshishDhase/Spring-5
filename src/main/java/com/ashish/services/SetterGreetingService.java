package com.ashish.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    private final String HELLO_GURUS = "HELLO FROM SetterGreetingService";
    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
