package com.greenfox.racoonclub.services;

import com.greenfox.racoonclub.models.Racoon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RacoonServices {
    private List<Racoon> racoonList = new ArrayList<Racoon>();
    private Racoon racoon;

    // CONSTRUCTOROK

    public RacoonServices(Racoon racoon) {
        this.racoon = racoon;
    }

    public RacoonServices() {
    }

    // METÓDUSOK

    public void racoonAdder (String name){
        Racoon newRacoon = new Racoon(name);
        racoonList.add(newRacoon);
    }

    public Racoon findByName (String searchedName){
        Racoon racoon= new Racoon();
        for (int i = 0; i < racoonList.size(); i++) {
            if (racoonList.get(i).getName().equals(searchedName)){
                racoon = racoonList.get(i);
            }
        }
        return racoon;
    }

    public List<Racoon> getRacoonList() {
        return racoonList;
    }
}
