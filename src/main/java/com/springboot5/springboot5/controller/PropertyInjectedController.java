package com.springboot5.springboot5.controller;

import com.springboot5.springboot5.services.GreetingServiceImpl;


//what NOt to do! least preferred
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
