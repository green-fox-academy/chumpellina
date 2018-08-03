import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int z = 1;
        int d = 1;
        int y = scanner.nextInt();
        for (z = 1; z <= y; z++) {

            for (x = 1; x <= z; x++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}