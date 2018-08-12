import java.util.Arrays;

public class SumAllElements {
    public static void main(String[] args) {
        Integer [] ai = {3, 4, 5, 6, 7};
        int béla = ai[0]+ai[1]+ai[2]+ai[3]+ai[4];

        System.out.println(béla);
    }
    public static int bélabéla (int [] z) {
        int temp = 0;
        for (int i = 0; i < z.length; i++) {
            temp = z[i] + z[i + 1];

        }
        return temp;

    }
}


