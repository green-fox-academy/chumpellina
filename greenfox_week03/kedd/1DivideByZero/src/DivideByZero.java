import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(divider(number));

    }

    public static int divider(int x) {
        try {
            int result = 10 / x;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");

        }
      return x;
    }
}



// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0