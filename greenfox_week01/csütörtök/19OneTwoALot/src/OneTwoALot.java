import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int szam = scanner.nextInt();
        if (szam <=0) {
            System.out.println("Not enough");}
            else if (szam == 1) {
                System.out.println("One");}
                else if (szam == 2) {
                    System.out.println("Two");}
                    else {
                        System.out.println("A lot");}


    }
}

