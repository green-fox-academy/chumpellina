package com.greenfox.rest.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {
    @GetMapping("/greeter")
    @ResponseBody
    public Greet greet(@RequestParam String name, @RequestParam String title) {
        Greet greet = new Greet(name, title);
        if (name == null || title == null) {
            greet.setError("Please provide an input!");
        } else
            greet.setWelcomeMessage("Oh, hy there " + name + " , my dear " + title + "!");
        return greet;
    }

    public class Greet {
        public String name;
        public String title;
        public String welcomeMessage;
        public String error;

        public Greet(String name, String title) {
            this.name = name;
            this.title = title;
        }

        public void setWelcomeMessage(String welcomeMessage) {
            this.welcomeMessage = welcomeMessage;
        }

        public void setError(String error) {
            this.error = error;
        }
    }
}
