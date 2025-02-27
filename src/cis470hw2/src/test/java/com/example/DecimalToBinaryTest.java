package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DecimalToBinaryTest {

    // Test valid input: 0
    @Test
    public void testZeroInput() {
        assertEquals("0", DecimalToBinary.toBinary(0)); // Expected binary is "0"
    }

    // Test valid input: 1
    @Test
    public void testPositiveInputOne() {
        assertEquals("1", DecimalToBinary.toBinary(1)); // Expected binary is "1"
    }

    // Test valid input: A small positive number
    @Test
    public void testPositiveInputFive() {
        assertEquals("101", DecimalToBinary.toBinary(5)); // Expected binary is "101"
    }

    // Test valid input: A larger number
    @Test
    public void testPositiveInputOneHundredTwelve() {
        assertEquals("1110000", DecimalToBinary.toBinary(112)); // Expected binary is "1110000"
    }

    // Test boundary input: Integer.MAX_VALUE
    @Test
    public void testMaxIntegerInput() {
        String expected = Integer.toBinaryString(Integer.MAX_VALUE); // Expected binary representation
        assertEquals(expected, DecimalToBinary.toBinary(Integer.MAX_VALUE));
    }

    // Test invalid input: Negative number
    @Test
    public void testNegativeInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            DecimalToBinary.toBinary(-1); // Negative input should throw an exception
        });
        assertEquals("Invalid input: Decimal number must be non-negative.", thrown.getMessage());
    }

    // Test invalid input: Non-integer input (testing with a casted float to
    // simulate invalid input)
    @Test
    public void testNonIntegerInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            DecimalToBinary.toBinary("test"); // Should throw an exception for non-integer input
        });
        assertThrows(IllegalArgumentException.class, () -> {
            DecimalToBinary.toBinary(3.14); // Should throw an exception for non-integer input
        });
    }
}