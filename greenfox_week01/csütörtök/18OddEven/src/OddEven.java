import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int szam = scanner.nextInt();
        if (szam%2 !=0 ) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }


    }
}





// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.