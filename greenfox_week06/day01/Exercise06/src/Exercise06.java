import java.util.ArrayList;
import java.util.Arrays;

public class Exercise06 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        cities.stream()
                .filter(city -> city.charAt(0) == 'A')
                .filter(city -> city.charAt(city.length() - 1) == 'I')
                .forEach(System.out::println);

    }
}
