import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int egy = scanner.nextInt();
        int kettő = scanner.nextInt();
        int három = scanner.nextInt();
        int négy = scanner.nextInt();
        int öt = scanner.nextInt();

        int sum = egy+kettő+három+négy+öt;
        int average = (egy+kettő+három+négy+öt)/5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}


// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4