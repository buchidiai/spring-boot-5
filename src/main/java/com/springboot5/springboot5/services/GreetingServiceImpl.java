package com.springboot5.springboot5.services;

public class GreetingServiceImpl implements  GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
