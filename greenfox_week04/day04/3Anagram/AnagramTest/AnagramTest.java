import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramTest {
    private String stringOne = "blablabla";
    private String stringTwo = "lablablab";
    private Anagram anagramOne = new Anagram(stringOne, stringTwo);


    @Test
    public void isAnagram() {
        assertTrue(anagramOne.isAnagram(anagramOne.getStringOne(), anagramOne.getStringTwo()));
    }


}