import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {
    static List<Sharpie> sharpieList = new ArrayList<>();
    public static List <Sharpie> sharpieListMaker() {
        sharpieList.add(new Sharpie("black", 20, 20));
        sharpieList.add(new Sharpie("red", 30, 0));
        sharpieList.add(new Sharpie("yellow", 40, 100));
        sharpieList.add(new Sharpie("blue", 25, 0));
        sharpieList.add(new Sharpie("green", 35, 80));

        return sharpieList;

    }
}

/*Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies*/


   /* Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
                countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies */