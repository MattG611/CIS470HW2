package com.example;
public class DecimalToBinary {

    public static String toBinary(Object decimal) {
        if (decimal instanceof Integer) {
            int decimalInt = (Integer) decimal;
            if (decimalInt < 0) {
                throw new IllegalArgumentException("Invalid input: Decimal number must be non-negative.");
            }
            return Integer.toBinaryString(decimalInt);
        } else {
            throw new IllegalArgumentException("Invalid input: Decimal number must be integer.");
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int decimal = 112;
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + toBinary(decimal));
    }
}
