public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String good = "";
        System.out.println(fordito(reversed));
    }

    public static String fordito(String reversed) {
        String temp = "";
        for (int i = reversed.length() - 1; i >= 0; i--) {
            temp += reversed.charAt(i);
        }

    return temp;
    }
}
