import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Random;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {

        for (int i = 0; i < 4; i++) {
            int randx = (int) (Math.random() * 100);
            int randy = (int) (Math.random() * 100);
            int randWidth = (int) (Math.random() * 100);
            int ranHeight = (int) (Math.random() * 100);
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            Color randomColor = new Color(r, g, b);
            drawSquares(graphics, randx, randy, randWidth, ranHeight, randomColor);

        }
        }
    public static void drawSquares (Graphics graphics,int randx, int randy, int randWidth, int ranHeight, Color
            randomColor ){
        graphics.fillRect(randx, randy, randWidth, ranHeight);
        graphics.setColor(randomColor);

    }


        // draw four different size and color rectangles.
        // avoid code duplication.




    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
