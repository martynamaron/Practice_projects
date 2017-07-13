package exercises;

public class Fibonacci {

    public void printFibonacciSequence(int positions) {
        for (int i = 0; i <= positions; i++) {
            System.out.println("Fibonacci number at position " + i + "is: " + fibonacci(i));
        }
    }

    private int fibonacci(int positions) {
        int n;
        if (positions == 0) {
            n = 0;
        } else if (positions == 1) {
            n = 1;
        } else {
            n = fibonacci(positions-2) + fibonacci(positions-1);
        }
        return n;
    }

}
