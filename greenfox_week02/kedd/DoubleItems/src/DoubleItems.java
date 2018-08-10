import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DoubleItems {
    public static void main(String... args) {
        int [] numList = {3,4,5,6,7};
        int [] xyz =new int[5];
        for (int i =0; i<5; i++) {
            xyz[i] = numList[i]*2;
        }
        System.out.println(Arrays.toString(xyz
        ));
    }
}



// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array