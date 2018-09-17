package com.greenfoxacademy.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetCounter {
    AtomicLong myAtomicLong = new AtomicLong();
    @RequestMapping ("/web/greeting")
    public String greeting(@RequestParam ("name") String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("counter", myAtomicLong);
        Greeting greeting = new Greeting(myAtomicLong.incrementAndGet(), "hellóbelló " + name);
        return "greeting";
    }

}