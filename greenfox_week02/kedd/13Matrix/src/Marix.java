import java.util.Arrays;

public class Marix {
    public static void main(String[] args) {

        int height = 4;
        int width = 4;

        int[][] myMatrix = matrixer(height, width);
        for (int i = 0; i < height; i++) {
            int[] xyz = myMatrix[i];
            System.out.println(Arrays.toString(xyz
            ));
        }
    }


    public static int[][] matrixer(int height, int width) {
        int[][] myMatrix = new int[height][width];
        for (int row = 0; row < height; row++) {

            for (int column = 0; column < width; column++) {
                if (row == column) {
                    myMatrix[row][column] = 1;
                } else {
                    myMatrix[row][column] = 0;
                }
            }
        }

        return myMatrix;
    }
}
