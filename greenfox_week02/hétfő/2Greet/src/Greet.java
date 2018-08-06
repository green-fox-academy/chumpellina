public class Greet {
    public static void main(String[] args) {
        String a1 = "GreenFox";
        System.out.println(greet(a1));

    }
    public static String greet (String a1) {
        String nev = a1;
        String nev2 =("Greetings, dear " + nev);
        return nev2;
    }
}
