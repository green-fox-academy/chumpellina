public class Counter {
    public static void main(String[] args) {
        int z = 30;
        System.out.println(counter(z));

    }

    public static int counter(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println(n);
            return counter((n - 1));

       }

    }
}


// Write a recursive function that takes one parameter: n and counts down from n.