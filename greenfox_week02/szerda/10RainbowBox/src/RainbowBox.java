import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
    public static void mainDraw(Graphics graphics) {
        Color colors[] = new Color[]{Color.lightGray, Color.black, Color.blue, Color.green, Color.yellow, Color.orange, Color.red, Color.BLACK};
        
        for (int i = 6; i >= 0; i--) {
            int x = 20 * i;
            sqareDraw(graphics, x);
            graphics.setColor((colors[i]));

        }
    }

    public static void sqareDraw(Graphics graphics, int x) {
        graphics.fillRect((WIDTH / 2 - x / 2), (HEIGHT / 2 - x / 2), x, x);

    }

    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}