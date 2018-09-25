package com.greenfox.racoonclub.controllers;

import com.greenfox.racoonclub.models.Racoon;
import com.greenfox.racoonclub.services.RacoonServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class mainController {
    private RacoonServices racoonServices;

    public mainController(RacoonServices racoonServices) {
        this.racoonServices = racoonServices;
    }

    @RequestMapping ("/")
    public String printMain (@RequestParam("name") String name, Model model) {
        Racoon newRacoon = racoonServices.findByName(name);
        List<Racoon> racoonList = racoonServices.getRacoonList();
        model.addAttribute("name", name);
        model.addAttribute("drink", newRacoon.getDrink());
        model.addAttribute("food", newRacoon.getFood());
        model.addAttribute("trickList", newRacoon.getTrickList());
        model.addAttribute("list", racoonList);
        return "index";
    }

    @GetMapping("/login")
    public String printGet (Model model) {
        model.addAttribute("name", "béla");
        return "login";
    }

    @PostMapping("/login")
    public String printPost (String name, Model model) {
        model.addAttribute("name", name);
        racoonServices.racoonAdder(name);
        return "redirect:/?name="+ name;
    }

    @GetMapping("/nutritionStore")
        public String printBasicNutritionStore() {
            return "nutritionStore";
        }

    @PostMapping ("/nutritionStore")
    public String printNutritionStore (@RequestParam ("name") String name, @RequestParam("food") String food,@RequestParam("drink") String drink, Model model){
        Racoon newRacoon = racoonServices.findByName(name);
        newRacoon.setNutrition(drink, food);
        model.addAttribute("racoon", newRacoon);

        return "redirect:/index";
    }

}
