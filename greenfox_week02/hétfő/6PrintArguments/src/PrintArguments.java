import java.util.Arrays;

public class PrintArguments {
    public static void main(String[] args) {
        String[] szovegek = {"bla", "blabla", "blablabla"};
        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third", "fourh");
    }

    public static void printParams(String... szovegek) {

        for (String arg : szovegek) {
            System.out.print(arg);
            System.out.println();
        }
    }

}

