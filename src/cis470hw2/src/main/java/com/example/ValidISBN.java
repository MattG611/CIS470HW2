package com.example;
public class ValidISBN {

    // Function to check if the given string is a valid ISBN number
    public static boolean isValidISBN(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: ISBN cannot be null or empty.");
        }

        isbn = isbn.replaceAll("-", "").trim(); // Remove hyphens and trim whitespace

        // Check for invalid characters
        if (!isbn.matches("[0-9X]+")) {
            throw new IllegalArgumentException("Invalid input: ISBN contains invalid characters.");
        }

        if (isbn.length() == 10) {
            return isValidISBN10(isbn);
        } else if (isbn.length() == 13) {
            return isValidISBN13(isbn);
        } else {
            throw new IllegalArgumentException(
                    "Invalid input: ISBN must be a 10- or 13-digit number, but found length: " + isbn.length());
        }
    }

    // Helper method to validate ISBN-10
    private static boolean isValidISBN10(String isbn) {
        if (isbn.length() != 10)
            return false;

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (isbn.charAt(i) - '0') * (10 - i);
        }
        char checkChar = isbn.charAt(9);
        sum += (checkChar == 'X') ? 10 : (checkChar - '0');
        return sum % 11 == 0;
    }

    // Helper method to validate ISBN-13
    private static boolean isValidISBN13(String isbn) {
        if (isbn.length() != 13)
            return false;

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = isbn.charAt(i) - '0';
            sum += (i % 2 == 0) ? digit : digit * 3;
        }
        int checkDigit = 10 - (sum % 10);
        return checkDigit == (isbn.charAt(12) - '0');
    }

    // Main method to test the function
    public static void main(String[] args) {
        String isbn = "9780470059029";
        System.out.println("Is ISBN valid? " + isValidISBN(isbn));
    }
}
