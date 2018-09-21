package com.greenfox.racoonclub.models;

import java.util.List;

public class Racoon {
    private String name;
    private String food;
    private String drink;
    private List <String> trickList;


   // GETTEREK SETTEREK

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<String> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<String> trickList) {
        this.trickList = trickList;
    }

    //CONSTRUCTOROK

    public Racoon() {
    }

    public Racoon(String name) {
        this.name = name;
        drink = "water";
        food = "garbage";
        trickList = null;
    }

    public Racoon(String name, String food, String drink, List <String> trickList) {
        this.name = name;
        this.food = "Burger";
        this.drink = "Cola";
        this.trickList = trickList;
    }

    public void setNutrition (String food, String drink){
        setDrink(drink);
        setFood(food);
    }
}


