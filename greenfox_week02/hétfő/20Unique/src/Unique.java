import com.sun.deploy.util.ArrayUtil;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Unique {
    public static void main(String[] args) {
        int[] béla = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(Arrays.toString(newArrayMaker(béla)));

    }
    public static int [] newArrayMaker (int [] m){
       Arrays.sort(m);
       for (int i=0; i< m.length-1;i++){
           if (m[i] == m[i+=1]){
               Arrayutils.remove (m, i+=1);
           }
       }
       return m;
    }
}

//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
       // System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`