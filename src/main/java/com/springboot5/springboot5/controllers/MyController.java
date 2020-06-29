package com.springboot5.springboot5.controllers;


import org.springframework.stereotype.Controller;
//@Controller makes this a spring bean
@Controller

public class MyController {
    public String hello() {
        System.out.println("Hello!!! from hello method");
        return "foo";
    }
}
