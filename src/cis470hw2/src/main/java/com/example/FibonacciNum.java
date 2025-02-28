package com.example;
public class FibonacciNum {

    // Function to calculate the nth Fibonacci number
    public static int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid input: n must be a non-negative integer.");
        }
        if (n > 50) { // Example computational limit
            throw new IllegalArgumentException("Error: Input exceeds computational limits.");
        }
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int n = 19;
        System.out.println("The " + n + "th Fibonacci number is: " + calculate(n));
    }
}
