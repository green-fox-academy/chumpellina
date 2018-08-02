public class Cuboid {
    public static void main(String[] args) {
        double a = 20.00;
        double b = 50.00;
        double c = 60.00;
        double x = 2.00;
        double surfaceArea = x * (a * b + b * c + a * c);
        double volume = a * b * c;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }
}



