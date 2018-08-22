import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Domino domino1 = new Domino(2, 2);
        Domino domino2 = new Domino(2, 6);
        Dominoes dominoes1 = new Dominoes();
        System.out.println(domino2.compareTo(domino1));

    }
}
