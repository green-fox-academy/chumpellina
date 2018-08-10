import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ProjectThree {
    public static void mainDraw(Graphics graphics) {
        int x = 25;
        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);
        graphics.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);

       for (int i = 0; i < 13; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH/2 - x * (13 - i), HEIGHT/2, WIDTH/2, HEIGHT/2-x*i);
        }

        for (int i = 0; i < 13; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH/2 - x * (13 - i), HEIGHT/2, WIDTH/2, HEIGHT/2 + x * i);
        }

        for (int i = 0; i < 13; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH/2 + x * (13 - i), HEIGHT/2, WIDTH/2, HEIGHT/2 + x * i);
        }

        for (int i = 0; i < 13; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH/2 + x * (13 - i), HEIGHT/2, WIDTH/2, HEIGHT/2-x*i);
        }

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