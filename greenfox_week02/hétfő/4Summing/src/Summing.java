public class Summing {
    public static void main(String[] args) {
        int parameter = 10;
        System.out.println(sum(parameter));

    }

    public static int sum(int parameter) {
        int osszeg = 0;
        for (int i = 1; i < parameter; i++) {
            osszeg += i;
        }
        ;
        return osszeg;
    }
}
