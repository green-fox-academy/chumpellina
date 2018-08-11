import java.util.Arrays;

public class AppendA {

    public static void main(String[] args) {

        String[] animals = {"koal", "pand", "zebr"};
       String [] béla = appendAFunct(animals);
        System.out.println(Arrays.toString(béla));


    }


    public static String[] appendAFunct(String animals []) {
        String x = Character.toString('a');


        for (int i = 0; i < animals.length; i++) {
            animals [i] = animals[i]+x;


        }
        return animals;
    }
}


// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
