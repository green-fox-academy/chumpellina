public class Main {
    public static void main(String... args) {
        PostIt postIt1 = new PostIt("orange ", "Idea 1 ", "blue ");
        PostIt postIt2 = new PostIt("pink ", "Awesome ", "black ");
        PostIt postIt3 = new PostIt("yellow ", "Superb! ", "green ");
        System.out.println(postIt1.toString());
        System.out.println(postIt2.toString());
        System.out.println(postIt3.toString());
    }
}


