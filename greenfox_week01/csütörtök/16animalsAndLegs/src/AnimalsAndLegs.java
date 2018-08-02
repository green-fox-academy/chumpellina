import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int csirkeszám = scanner.nextInt();
        int malacszám = scanner.nextInt();
        int csirkeláb = csirkeszám*2;
        int malacláb = malacszám*4;
        int béla = malacláb + csirkeláb;
        System.out.println("A gazda udvarában " + béla + " láb szaladgál");
    }
}

