package com.greenfox.rest.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {

    @RequestMapping("/index")
    public String restMethod () {
        return "index";
    }
}

