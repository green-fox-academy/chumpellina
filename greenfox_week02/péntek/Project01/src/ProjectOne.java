import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ProjectOne {
    public static void mainDraw(Graphics graphics) {
        int x = 25;
        for (int i = 0; i < 13; i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(WIDTH - x * (13 - i),0, WIDTH, x * i);}
        for (int i = 0; i < 13; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0,HEIGHT - x * (13 - i), x*i, HEIGHT);}


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