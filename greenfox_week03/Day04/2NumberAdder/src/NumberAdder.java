public class NumberAdder {
    public static void main(String[] args) {
        int z = 4;
        System.out.println(adder(z));
    }

    public static int adder(int n) {
        int temp;
        if (n == 1) {
            return 1;
        } else {
            return n+ adder(n-1);

        }

    }
}


// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.