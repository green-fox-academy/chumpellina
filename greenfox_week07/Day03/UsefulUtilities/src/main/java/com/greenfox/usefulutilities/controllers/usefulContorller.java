package com.greenfox.usefulutilities.controllers;

import com.greenfox.usefulutilities.services.RandomColor;
import com.greenfox.usefulutilities.services.ValidateEmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class usefulContorller{
    private RandomColor randomColor;
    private ValidateEmail validateEmail;

    public usefulContorller(RandomColor randomColor) {
        this.randomColor = randomColor;
    }

    @RequestMapping("/useful")
    public String printMain () {

        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String makeBackground () {
        randomColor.randomColor();
        return "useful";
    }

    @RequestMapping("/useful/email")
    public String goToLinks (@RequestParam("email") String input, Model model) {
       Boolean valid = validateEmail.check(input);
        model.addAttribute("valid", valid);
        return "email";
    }

    @RequestMapping("/useful/ceasardecoder")
    public String goToLinks () {

        return "ceasardecoder";
    }


}
