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

    public usefulContorller(RandomColor randomColor, ValidateEmail validateEmail) {
        this.randomColor = randomColor;
        this.validateEmail= validateEmail;
    }


    @RequestMapping("/useful")
    public String printMain () {

        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String makeBackground (Model model) {
        String color = randomColor.randomColor();
        model.addAttribute("color", color);
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String validate (@RequestParam("email") String input, Model model) {
       Boolean valid = validateEmail.check(input);
        model.addAttribute("valid", valid);
        model.addAttribute("email", input);
        return "email";
    }

    @RequestMapping("/useful/ceasardecoder")
    public String goToLinks () {

        return "ceasardecoder";
    }


}
