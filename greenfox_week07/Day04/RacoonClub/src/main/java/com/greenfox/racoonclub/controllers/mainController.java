package com.greenfox.racoonclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
    private Character character;

    public mainController(Character character) {
        this.character = character;
    }

    @RequestMapping ("/")
    public String printMain (@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
    @RequestMapping ("/login")
    public String printMain () {
        return "login";
    }
    @RequestMapping ("/login/get")
    public String printGet () {
        return "login";
    }
    @RequestMapping ("/login/post")
    public String printPost (@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        character.charLister (name);
        return "index";
    }


}
