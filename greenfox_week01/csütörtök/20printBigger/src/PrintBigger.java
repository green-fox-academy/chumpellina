import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double elso = scanner.nextDouble();
        double masodik = scanner.nextDouble();
        if(elso>masodik) {
            System.out.println(elso);
        }else if (masodik>elso) {
            System.out.println(masodik);
        }else{
            System.out.println("egyenlőek");}
    }

}
