import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    Scanner scanner = new Scanner(System.in);
    int myNum = scanner.nextInt();




    public int getCertainFibonacci(ArrayList<Integer> fib, int x) {
        int u = 0;
        for (int i = 1; i < myNum; i++) {
            u += fib.get(i - 1);

        }
        return u;

    }

}

// Write a function that computes a member of the fibonacci sequence by a given index
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.