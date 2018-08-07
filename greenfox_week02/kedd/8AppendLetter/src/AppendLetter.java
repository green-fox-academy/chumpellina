import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class AppendLetter {

    public static void main(String... args) {

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        appendA(far);
        System.out.println(far);
    }

    public static void appendA(List far) {
        for (int i = 0; i <= far.size()-1; i++)
        {
            far.set(i, (far.get(i) + "a"));
        }

    }
}


// Create a method called "appendA()" that adds "a" to every string in the "far" list.
// The parameter should be a list.

