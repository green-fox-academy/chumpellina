public class TakesLonger {
    public static void main(String... args) {
        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        System.out.println(quote.length());
        StringBuilder béla = new StringBuilder("always takes longer than");
        System.out.println(quote.substring(0, 21) + béla + quote.substring(20, 82));

    }
}
