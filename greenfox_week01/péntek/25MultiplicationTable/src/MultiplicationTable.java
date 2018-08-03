import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int szorzat = 1;
        while (szorzat < 100) {
            System.out.println(szorzat * num); szorzat++;
        }


    }
}
