import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        Animal zebra = new Animal();
        Animal koala = new Animal();
        System.out.println(koala.eat());
        System.out.println(koala.eat());
        System.out.println(Arrays.toString(koala.play()));
    }


}



