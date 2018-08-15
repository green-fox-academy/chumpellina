import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Dominoes> listOfDoms = new ArrayList<Dominoes>();
        listOfDoms = initializeDominoes();
        System.out.println(DominoPlayer(listOfDoms));
    }

    static List<Dominoes> initializeDominoes() {
        List<Dominoes> listOfDoms = new ArrayList<>();
        listOfDoms.add(new Dominoes(5, 2));
        listOfDoms.add(new Dominoes(4, 6));
        listOfDoms.add(new Dominoes(1, 5));
        listOfDoms.add(new Dominoes(6, 7));
        listOfDoms.add(new Dominoes(2, 4));
        listOfDoms.add(new Dominoes(7, 1));
        return listOfDoms;
    }
    static List<Dominoes> DominoPlayer (List<Dominoes>newList) {

        for (int i=0+1; i<newList.size()-1; i++){
            newList.get(i);


        }


        return newList;

    }
}





    /*You have the list of Dominoes
    Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        eg: [2, 4], [4, 3], [3, 5] ... */