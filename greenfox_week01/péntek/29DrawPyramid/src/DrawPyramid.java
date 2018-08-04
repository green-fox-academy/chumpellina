import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int z = 1;
        int w = 1;
        int y = scanner.nextInt();
        int g =1;

        for (z = 1; z <= y++; z+=2) {

            for (g = 1; g <= y-z; g++) {
                System.out.print(" ");
            }
            for (x = 1; x <= z; x++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}





