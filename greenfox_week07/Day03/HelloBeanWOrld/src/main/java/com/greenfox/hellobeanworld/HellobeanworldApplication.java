package com.greenfox.hellobeanworld;

import com.greenfox.hellobeanworld.services.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {
    private Printer printer;
    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    public HellobeanworldApplication(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run(String... args) throws Exception {
    printer.log("hello");
    }
}

