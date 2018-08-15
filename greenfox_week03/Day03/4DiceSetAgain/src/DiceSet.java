import java.util.Arrays;

public class DiceSet {
    public static void main(String[] args) {
        int[] dices = new int[6];
        System.out.println(Arrays.toString((roll(dices))));
    }

    public static int[] roll(int[] dicesFirst) {
        while (dicesFirst[0] != 6 || dicesFirst[1] != 6 || dicesFirst[2] != 6 || dicesFirst[3] != 6 || dicesFirst[4] != 6 || dicesFirst[5] != 6) {
            for (int i = 0; i < dicesFirst.length; i++) {
                dicesFirst[i] = (int) (Math.random() * 6) + 1;
            }
        }
        return dicesFirst;
    }


}


