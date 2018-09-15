import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    List<Fish> fishList;

    public List<Fish> status() {
        return fishList;
    }

    public List <Fish> add (Fish fishToAdd) {
         fishList.add(fishToAdd);
         return fishList;
    }

    public List<Fish> feed() {
        for (int i = 0; i < fishList.size(); i++) {
            if (fishList.get(i) instanceof Tang == true || fishList.get(i) instanceof Clownfish == true) {
                fishList.get(i).setWeight(fishList.get(i).getWeight() + 1);
            } else fishList.get(i).setWeight(fishList.get(i).getWeight() + 2);

        }
        return fishList;
    }

    public List<Fish> removeOversizedFishes() {
        for (int i = 0; i < fishList.size(); i++) {
            if (fishList.get(i).getWeight() >= 11) {
                fishList.remove(fishList.get(i));
            }
        }
        return fishList;
    }
}
