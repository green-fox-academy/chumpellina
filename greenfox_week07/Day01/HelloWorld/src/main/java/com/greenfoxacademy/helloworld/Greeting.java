package com.greenfoxacademy.helloworld.controllers;

import org.springframework.stereotype.Controller;


public class Greeting {
    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.id = 1;
        this.content = "Hello World";
    }
}