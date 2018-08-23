import java.util.ArrayList;
import java.util.List;

public class Sum {


   public int sum(ArrayList<Integer> x) {
        int y = 0;
        for (int i = 0; i < x.size() ; i++) {
            y += x.get(i);
        }
        return y;
    }


}
