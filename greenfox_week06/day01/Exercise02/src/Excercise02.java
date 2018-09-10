import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


import static jdk.nashorn.internal.objects.NativeArray.map;

public class Excercise02 {
    public static void main(String[] args) {
        /// Write a Stream Expression to get the average value of the odd numbers from the following array:

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        numbers.stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 1)
                .average()
                .ifPresent(avg -> System.out.println(avg));
    }
}
