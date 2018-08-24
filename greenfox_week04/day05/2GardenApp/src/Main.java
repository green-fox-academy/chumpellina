import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();


        Plant plant1 = new Flower(0, "yellow", 0.75);
        Plant plant2 = new Flower(0, "blue", 0.75);
        Plant plant3 = new Tree(0, "purple", 0.40);
        Plant plant4 = new Tree(0, "orange", 0.40);


        garden.add(plant1);
        garden.add(plant2);
        garden.add(plant3);
        garden.add(plant4);

    }

}
