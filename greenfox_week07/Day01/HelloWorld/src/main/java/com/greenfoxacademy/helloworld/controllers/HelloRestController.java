package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {
    AtomicLong myAtomicLong = new AtomicLong();
@RequestMapping ("/greeting")
    public Greeting greeting(@RequestParam ("name") String name){
    Greeting greeting = new Greeting(myAtomicLong.incrementAndGet(), "hellóbelló " + name);
    return greeting;
    }

}

