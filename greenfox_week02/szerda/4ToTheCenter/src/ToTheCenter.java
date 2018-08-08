import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
    public static void mainDraw(Graphics graphics) {

        int x1 = 40;
        int y1 = 20;
        drawFunction(graphics, x1, y1);
    }


    public static void drawFunction(Graphics graphics, int x1, int y1) {
        graphics.drawLine( x1, y1, WIDTH / 2, HEIGHT / 2);

        }


        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 343;

        public static void main (String[]args){
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
