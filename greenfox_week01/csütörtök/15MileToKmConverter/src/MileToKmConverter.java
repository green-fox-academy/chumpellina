import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double Userkm = scanner.nextDouble();
        double x = 1.61;
        double béla = x*=Userkm;

        System.out.println("that is equal to " + béla + " miles");

    }
}
