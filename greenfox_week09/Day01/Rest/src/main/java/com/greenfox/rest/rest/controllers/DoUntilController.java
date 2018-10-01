package com.greenfox.rest.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DoUntilController {
    @PostMapping ("/dountil/{action}")
    @ResponseBody
    public static MyNumber counter (@PathVariable String action, @RequestBody Input until){
        MyNumber myNumber = new MyNumber();

        if (action.equals("sum")){
            int sum=0;
            for (int i = 0; i < until.getUntil(); i++) {
                sum = sum +i;
                myNumber.setResult(sum);
            }
        }
        else if (action.equals("factor")){
            int sum = 1;
            for (int i = 0; i < until.getUntil(); i++) {
                sum = sum *i;
                myNumber.setResult(sum);
            }
        }
        else myNumber.setError ("Please provide a number!");

        return myNumber;
    }

    public static class Input{
        int until;
        public int getUntil() {
            return until;
        }
    }

    public static class MyNumber {
        public int result;
        public String error;

        public void setResult(int result) {
            this.result = result;
        }

        public void setError(String error) {
            this.error = error;
        }
    }

}

