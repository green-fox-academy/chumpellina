import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTriangles {


    public static void mainDraw(Graphics graphics) {

        DrawTriangle(graphics, 1,1,320, 277);{
            DrawTriangle(graphics, 0,0, 160, 138);
            DrawTriangle(graphics, 3/4*WIDTH,0, 160, 138);
        }


        /*graphics.drawLine((int) (wiwi / 2.00), 0, (int) (3.00 * wiwi / 4.00), (int) (hehe / 2.00));
        graphics.drawLine((int) (wiwi / 2.00), 0, (int) (wiwi / 4.00), (int) (hehe / 2.00));
        graphics.drawLine((int) (wiwi / 4.00), (int) (hehe / 2.00), (int) (3.00 * wiwi / 4.00), (int) (hehe / 2.00));

        graphics.drawLine((int) (wiwi / 4.00), 0, (int) (3.00 / 8.00 * wiwi), (int) (hehe / 4.00));
        graphics.drawLine((int) (3.00 / 8.00 * wiwi), (int) (hehe / 4.00), (int) (wiwi / 8.00), (int) (hehe / 4.00));
        graphics.drawLine((int) (wiwi / 8.00), (int) (hehe / 4.00), (int) (wiwi / 4.00), 0);

        graphics.drawLine((int)(wiwi / 2.00),(int) (hehe/2.00), (int )(5.00/8.00*wiwi) , (int)(3.00/4.00* hehe ));
        graphics.drawLine((int)(wiwi / 2.00),(int) (hehe/2.00), (int )(3.00/8.00*wiwi) , (int)(3.00/4.00* hehe ));
        graphics.drawLine((int)(5.00/8.00*wiwi), (int)(3.00/4.00* hehe), (int )(3.00/8.00*wiwi) , (int)(3.00/4.00* hehe ));

        graphics.drawLine((int)(6.00/8.00*wiwi),0, (int )(5.00/8.00*wiwi) , (int)(hehe/4.00));
        graphics.drawLine((int)(6.00/8.00*wiwi),0 , (int )(7.00/8.00*wiwi) , (int)(hehe/4.00));
        graphics.drawLine((int )(5.00/8.00*wiwi) , (int)(hehe/4.00), (int )(7.00/8.00*wiwi) , (int)(hehe/4.00)); */


    }


    public static void DrawTriangle(Graphics graphics, double x1, double y1, double wiwi, double hehe) {
        graphics.drawLine((int) (x1+(wiwi / 2.00)), 0, (int) (3.00 * wiwi / 4.00), (int) (hehe / 2.00));
        graphics.drawLine((int) (wiwi / 2.00), 0, (int) (wiwi / 4.00), (int) (hehe / 2.00));
        graphics.drawLine((int) (wiwi / 4.00), (int) (hehe / 2.00), (int) (3.00 * wiwi / 4.00), (int) (hehe / 2.00));
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



