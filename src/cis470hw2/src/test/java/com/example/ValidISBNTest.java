package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidISBNTest {

    // Test for valid ISBN-10
    @Test
    public void testValidISBN10() {
        assertTrue(ValidISBN.isValidISBN("0471958697"));
        assertTrue(ValidISBN.isValidISBN("0-471-95869-7"));
        assertTrue(ValidISBN.isValidISBN("0306406152"));
        assertTrue(ValidISBN.isValidISBN("0-306-40615-2"));
        assertTrue(ValidISBN.isValidISBN("123456789X"));
    }

    // Test for valid ISBN-13
    @Test
    public void testValidISBN13() {
        assertTrue(ValidISBN.isValidISBN("9780470059029"));
        assertTrue(ValidISBN.isValidISBN("978-0-470-05902-9"));
        assertTrue(ValidISBN.isValidISBN("9780306406157"));
        assertTrue(ValidISBN.isValidISBN("978-0-306-40615-7"));
    }

    // Test for invalid ISBN (wrong length)
    @Test
    public void testInvalidISBNLength() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> ValidISBN.isValidISBN("123456789"));
        assertEquals("Invalid input: ISBN must be a 10- or 13-digit number, but found length: 9",
                exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> ValidISBN.isValidISBN("12345678901"));
        assertEquals("Invalid input: ISBN must be a 10- or 13-digit number, but found length: 11",
                exception2.getMessage());

        Exception exception3 = assertThrows(IllegalArgumentException.class,
                () -> ValidISBN.isValidISBN("123456789012"));
        assertEquals("Invalid input: ISBN must be a 10- or 13-digit number, but found length: 12",
                exception3.getMessage());

        Exception exception4 = assertThrows(IllegalArgumentException.class,
                () -> ValidISBN.isValidISBN("12345678901234"));
        assertEquals("Invalid input: ISBN must be a 10- or 13-digit number, but found length: 14",
                exception4.getMessage());
    }

    // Test for invalid ISBN (non-numeric characters)
    @Test
    public void testInvalidISBNCharacters() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> ValidISBN.isValidISBN("ABC4567890"));
        assertEquals("Invalid input: ISBN contains invalid characters.", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class,
                () -> ValidISBN.isValidISBN("978A470059029"));
        assertEquals("Invalid input: ISBN contains invalid characters.", exception2.getMessage());
    }

    // Test for invalid ISBN (empty or null input)
    @Test
    public void testInvalidISBNEmptyOrNull() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> ValidISBN.isValidISBN(""));
        assertEquals("Invalid input: ISBN cannot be null or empty.", exception1.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> ValidISBN.isValidISBN(null));
        assertEquals("Invalid input: ISBN cannot be null or empty.", exception2.getMessage());
    }
}
