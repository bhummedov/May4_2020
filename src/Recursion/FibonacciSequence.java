package Recursion;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }
    public static long fibonacci (int i) {
        if (i == 0) return 0;
        if (i<= 2) return 1;
        long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
        return fibTerm;
    }
}
