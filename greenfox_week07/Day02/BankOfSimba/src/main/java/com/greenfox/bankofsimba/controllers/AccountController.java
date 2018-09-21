package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

    @RequestMapping("/show")
    public String bankAccount(Model model) {
        BankAccount account = new BankAccount("Simba", 2000.00, "lion", false);
        model.addAttribute("name", account.getName());
        model.addAttribute("balance", account.getBalance());
        model.addAttribute("animalType", account.getAnimalType());
        return "AccountView";
    }

    @RequestMapping("/info")
    public String bankInfo(Model model) {
        String string = "This is an <em> HTML </em> text. <b> Enjoy yourself!</b>";
        model.addAttribute("string", string);
        return "AccountInfo";
    }

    @RequestMapping("/list")
    public String accountLister (Model model) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("Timon", 1000.00, "suricate", false));
        accounts.add (new BankAccount("Pumba", 2000.00, "warthog", false));
        accounts.add (new BankAccount("Mufasa", 3000.00, "lion", true));
        accounts.add (new BankAccount("Nala", 4000.00, "lion", false));
        model.addAttribute("list", accounts);

        return "AccountList";

    }
}

