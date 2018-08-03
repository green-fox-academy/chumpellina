import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int y = scanner.nextInt();
        for (; x <= y; x++) {
            System.out.println("*");
            for (; x <= y; x++) {
                System.out.print("*");


            }


        }
    }
}
