import javax.swing.*;

import java.awt.*;
import java.security.KeyStore;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

    public static void mainDraw(Graphics graphics) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                graphics.fillRect(10 * i, (10 * j), 10, 10);

                if (i%2==1) {
                    if (j % 2 == 1) {
                        graphics.setColor(Color.BLACK);
                    }
                    else graphics.setColor(Color.WHITE);
                }
                if (i%2==0) {
                    if (j % 2 == 0) {
                        graphics.setColor(Color.BLACK);
                    }
                    else graphics.setColor(Color.WHITE);
                }



            }

        }

        /* (int i=1; i<9; i++) {
            graphics.drawLine(i*(WIDTH/8), 0, i*(WIDTH/8), HEIGHT);
        }
        for (int i=1; i<9; i++) {
            graphics.drawLine(0, i*(HEIGHT/8), WIDTH, i*(HEIGHT/8));
        }*/

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
