import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animals> myAnimals;
    int slot;

    public Farm(int slot) {

        myAnimals = new ArrayList<>();
        this.slot = slot;

    }

    public void breed() {
        if (myAnimals.size() + 1 <= slot) {
            myAnimals.add(new Animals());
        }

    }

    public void slaughter () {

    }

/*    public void breed() {
        for (slot = 3; slot > 0; slot--) {
            if (slot == 3) {
                myAnimals.add(7, béka);
            } else if (slot == 2) {
                myAnimals.add(8, kacsa);
            } else if (slot == 1) {
                myAnimals.add(9, kutya);
            }
            */
}





   /* Create a Farm class
it has list of Animals
                it has slots which defines the number of free places for animals
        breed() -> creates a new animal if there's place for it
        slaughter() -> removes the least hungry animal */
