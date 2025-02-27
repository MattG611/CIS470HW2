package com.example;
public class DecimalToBinary {

    // Function to convert decimal to binary
    public static String toBinary(int decimal) {
        if (decimal < 0) {
            throw new IllegalArgumentException("Invalid input: Decimal number must be non-negative.");
        }
        return Integer.toBinaryString(decimal);
    }

    // Main method to test the function
    public static void main(String[] args) {
        int decimal = 112;
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + toBinary(decimal));
    }
}
