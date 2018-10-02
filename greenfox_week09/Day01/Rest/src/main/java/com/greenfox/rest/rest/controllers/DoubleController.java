package com.greenfox.rest.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoubleController {

    @RequestMapping("/index")
    public String restMethod() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Output makeDouble(@RequestParam int input) {
        Output output = new Output(input);
        if (input == 0) {
            output.setError("Please provide an input!");
        }
        return output;
    }

    public class Output {
        public int received;
        public int result;
        public String error = null;

        public Output(int input) {
            this.received = input;
            this.result = input * 2;
        }

        public void setError(String error) {
            this.error = error;
        }

        public int getResult() {
            return result;
        }
    }
}


