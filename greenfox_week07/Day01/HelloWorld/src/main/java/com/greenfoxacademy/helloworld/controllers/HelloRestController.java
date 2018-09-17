package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
@RequestMapping
    public Greeting greeting(){
    Greeting greeting = new Greeting(1, "hellóbelló");
    return greeting;
    }
}
