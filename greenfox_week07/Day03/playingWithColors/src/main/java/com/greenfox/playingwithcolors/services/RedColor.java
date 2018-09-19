package com.greenfox.playingwithcolors.services;

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

