import java.util.*;

public class HeWillNever {
    public static void main(String... args) {
        String out = "";
        Integer[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "run around and desert you");
        map.put(50, "tell a lie and hurt you ");
        map.put(49, "make you cry, ");
        map.put(2, "let you down");
        map.put(12, "give you up, ");
        map.put(1, "Never gonna ");
        map.put(11, "\n");
        map.put(3, "say goodbye ");


        System.out.print(map.get(1));
        System.out.print(map.get(12));
        System.out.print(map.get(1));
        System.out.print(map.get(2));
        System.out.print(map.get(11));
        System.out.print(map.get(1));
        System.out.print(map.get(7));
        System.out.print(map.get(11));
        System.out.print(map.get(1));
        System.out.print(map.get(49));
        System.out.print(map.get(1));
        System.out.print(map.get(3));
        System.out.print(map.get(11));
        System.out.print(map.get(1));
        System.out.print(map.get(50));
        System.out.print(map.get(11));
            // Things are a little biSystem.out.print(map.get(1));t messed up
            // Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
            // Assemble the fragments into the out variable


        }
    }

