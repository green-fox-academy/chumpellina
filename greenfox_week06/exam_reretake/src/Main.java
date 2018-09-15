import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        aquarium.add(new Koi("Nami", 9, "pink"));
        aquarium.add(new Tang("Dory", 8, "blue", true));
        aquarium.add(new Tang("Bubbles", 10, "yellow", false));
        aquarium.add(new Clownfish("Nemo", 5, "orange", "white"));

        System.out.println(aquarium.status());

       // aquarium.feed();

        //aquarium.removeOversizedFishes();

        //System.out.println(aquarium.status());

    }

}
