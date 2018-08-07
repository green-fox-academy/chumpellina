import java.util.*;
import java.util.ArrayList;

public class MatchMaking {
    public static void main(String... args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(joiner(girls, boys));
    }

    public static ArrayList joiner(ArrayList girls, ArrayList boys) {
        ArrayList<Object> together = new ArrayList<>();

        for (int i = 0; i <= girls.size()-1; i++) {
            together.add(girls.get(i));
            together.add(boys.get(i));
        }
        together.add(boys.get(boys.size()-1));
        return together;
    }


}


// Write a method that joins the two lists by matching one girl with one boy into a new list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

// kollnévHova.addAll (kollnévHonnan) → átmásolja az utóbbi kollekció elemeit az előbbibe
