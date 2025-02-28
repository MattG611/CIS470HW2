package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciMin() {
        assertEquals(0, FibonacciNum.calculate(0), "Fibonacci(0) should be 0");
    }

    @Test
    public void testFibonacciMinPlus() {
        assertEquals(1, FibonacciNum.calculate(1), "Fibonacci(1) should be 1");
    }

    @Test
    public void testFibonacciGeneralCases() {
        assertEquals(5, FibonacciNum.calculate(5), "Fibonacci(5) should be 5");
        assertEquals(55, FibonacciNum.calculate(10), "Fibonacci(10) should be 55");
    }

    @Test
    public void testFibonacciMaxMinus() {
        assertEquals(832040, FibonacciNum.calculate(30), "Fibonacci(30) should be 832040");
    }

    @Test
    public void testFibonacciMax() {
        assertEquals(102334155, FibonacciNum.calculate(40), "Fibonacci(40) should be 102334155");
    }

    @Test
    public void testFibonacciNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FibonacciNum.calculate(-1));
        assertEquals("Invalid input: n must be a non-negative integer.", exception.getMessage());
    }

    @Test
    public void testFibonacciExceedMax() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FibonacciNum.calculate(1000000));
        assertEquals("Error: Input exceeds computational limits.", exception.getMessage());
    }
}
