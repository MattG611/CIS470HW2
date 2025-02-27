package com.example;

import java.util.Scanner;

public class ReverseString {

    // Function to reverse the string
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: String cannot be null or empty.");
        }
        return new StringBuilder(input).reverse().toString();
    }

    // Main method to get user input and test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        try {
            // Reverse and print the string
            System.out.println("Reversed String: " + reverse(input));
        } catch (IllegalArgumentException e) {
            // Handle invalid input
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
