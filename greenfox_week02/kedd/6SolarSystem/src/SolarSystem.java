import java.util.*;

public class SolarSystem {
    public static void main(String... args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        //planetList.add(5, "Saturn");
        System.out.println(putSaturn(planetList));
    }

    public static ArrayList<String> putSaturn(ArrayList planetList) {
        ArrayList<String> addedList = new ArrayList<String>(planetList);
        addedList.add(5, "Saturn");
        return addedList;

    }
}

// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.