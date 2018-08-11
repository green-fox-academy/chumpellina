import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        ArrayList <String> béla = quoteSwap(list);
        System.out.println(béla);


    }

    public static ArrayList<String> quoteSwap (ArrayList list) {
        String a = (String) list.get(2);
        list.set(2, "cannot");
        list.set(5, a);
        return new ArrayList(list);
    }
}

// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().

// Also, print the sentence to the output with spaces in between.
// Expected output: "What I cannot create I do not understand."