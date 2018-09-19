package com.greenfox.usefulutilities.services;

public class ValidateEmail {

    public Boolean check (String input) {
        if (input.contains ("@") && input.contains("."))
        return true;
        else return false;
    }
}
