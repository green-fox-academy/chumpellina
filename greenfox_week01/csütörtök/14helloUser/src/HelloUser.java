import java.util.Scanner;
public class HelloUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String UserInput1 = scanner.nextLine();

        System.out.println("Hello," + UserInput1 + "!");
    }
}
