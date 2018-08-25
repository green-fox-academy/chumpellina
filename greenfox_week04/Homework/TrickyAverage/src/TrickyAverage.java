import java.util.Arrays;

public class TrickyAverage {
    private int[] myArray;

    public TrickyAverage(int[] myArray) {
        this.myArray = myArray;
    }

    public int[] getMyArray() {
        return myArray;
    }


    public int getMin(int[] x) {
        int min = x[0];

        while (min%2 != 0) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] < min) {
                    min = x[i];
                }

            }
            return min;

        }
        return min;
    }

    public int getMax(int[] x) {
        int max = x[0];
        while (max % 2 == 0) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > max) {
                    max = x[i];
                }

            }
            return max;

        }
        return max;
    }


    public int getTrickyAvg(int[] x) {
        int min = getMin(x);
        int max =getMax(x);
        int average =(min+max)/2;
        return average;

    }


}



/*
 * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
 * and returns the average of the smallest odd and largest even.
 *  - use only basic control flow statements, like 'for', 'if', etc.
 *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
 *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
 *
 * Example cases:
 * [1, 2, 3] -> should return 1.5
 * [3, 4, 5, 6] -> should return 4.5
 * [5, 2, 8, -1] -> should return 3.5
 */