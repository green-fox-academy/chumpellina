import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();

        ArrayList<Integer> fib =new ArrayList<Integer>();

            fib.add(0);
            fib.add(1);
            fib.add(1);
            fib.add(2);
            fib.add(3);
            fib.add(5);
            fib.add(8);
            fib.add(13);
            fib.add(21);
            fib.add(34);




        Fibonacci myFib = new Fibonacci();
        System.out.println(myFib.getCertainFibonacci(fib, myNum));




    }
}
