package com.greenfox.rest.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppendAController {
    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Word appender(@PathVariable String appendable){
        Word myWord = new Word(appendable);
        myWord.setContent(appendable + "a");
        return myWord;
    }

    @PostMapping("/appenda/{appendable}")
    @ResponseBody
    public Word errorSender (@PathVariable String appendable){
        Word word = new Word(appendable);
        return word;
    }

    public class Word {
        public String content;

        public Word(String content) {
            this.content = content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
