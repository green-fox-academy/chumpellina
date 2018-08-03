import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 1;
        int b = 1;
        for (a=1; a <= num; a++){

            for ( b = 1; b <= a; b++){
                System.out.print(" ");
                System.out.print("*");
                System.out.println(" ");

        }System.out.println();

        }

    }
}




// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
