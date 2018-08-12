import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        Integer[] aj = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(reverser(aj)));

    }
    public static Integer[] reverser (Integer[]m){

        Integer [] reversed = {m[m.length-1], m[m.length-2], m[m.length-3], m[m.length-4], m[m.length-5]};
        return reversed;
    }
}

