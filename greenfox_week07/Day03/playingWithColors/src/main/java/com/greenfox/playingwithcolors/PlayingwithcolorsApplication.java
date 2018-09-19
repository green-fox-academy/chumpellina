package com.greenfox.playingwithcolors;

import com.greenfox.playingwithcolors.services.BlackColor;
import com.greenfox.playingwithcolors.services.MyColor;
import com.greenfox.playingwithcolors.services.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayingwithcolorsApplication implements CommandLineRunner {
    private Printer printer;
    private MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(PlayingwithcolorsApplication.class, args);
    }

    /*public PlayingwithcolorsApplication(Printer printer) {
        this.printer = printer;
    } */

    public PlayingwithcolorsApplication(BlackColor blackColor) {
        this.myColor = blackColor;
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
    }
}
