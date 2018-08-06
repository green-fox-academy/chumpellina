public class Factorialis {
    public static void main(String[] args) {
        int parameter = 5;
        System.out.println(factorio(parameter));

    }

    public static int factorio(int parameter) {
        int szorzat = 1;
        for (int i = 1; i <= parameter; i++) { szorzat *=i;
        }
        return szorzat;
    }
}
