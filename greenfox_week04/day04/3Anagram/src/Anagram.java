import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    private String stringOne;
    private String stringTwo;

    public String getStringOne() {
        return stringOne;
    }

    public String getStringTwo() {
        return stringTwo;
    }

    public Anagram(String x, String y) {
        this.stringOne = x;
        this.stringTwo = y;
    }

    public boolean isAnagram(String x, String y) {
        char[] xa = x.toCharArray();
        char[] ya = y.toCharArray();

        Arrays.sort(xa);
        Arrays.sort(ya);

        if (Arrays.equals(xa, ya)) {
            return true;
        } else return false;
    }

}
