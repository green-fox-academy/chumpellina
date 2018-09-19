package com.greenfox.usefulutilities.services;

import org.springframework.stereotype.Service;

@Service
public class ValidateEmail {

    public Boolean check (String input) {
        if (input.contains ("@") && input.contains("."))
        return true;
        else return false;
    }
}
