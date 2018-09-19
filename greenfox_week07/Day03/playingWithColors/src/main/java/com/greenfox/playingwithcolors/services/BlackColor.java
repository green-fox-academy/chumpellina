package com.greenfox.playingwithcolors.services;

import org.springframework.stereotype.Service;


public class BlackColor implements MyColor {
    private Printer printer;

    @Override
    public void printColor() {
        printer.log("It is black in color");
    }

    public BlackColor(Printer printer) {
        this.printer=printer;
    }
}
