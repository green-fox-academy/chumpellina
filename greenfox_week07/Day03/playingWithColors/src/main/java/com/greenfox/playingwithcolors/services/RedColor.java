package com.greenfox.playingwithcolors.services;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
    private Printer printer;

    public RedColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is red in color");
    }

}

