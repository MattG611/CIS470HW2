package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {

    // Test for empty string (min)
    @Test
    public void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> {
            ReverseString.reverse(""); // Expected: IllegalArgumentException
        });
    }

    // Test for null string (invalid)
    @Test
    public void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            ReverseString.reverse(null); // Expected: IllegalArgumentException
        });
    }

    // Test for single-character string (min+)
    @Test
    public void testSingleCharacter() {
        assertEquals("a", ReverseString.reverse("a")); // Expected: "a"
    }

    // Test for two-character string
    @Test
    public void testTwoCharacterString() {
        assertEquals("ba", ReverseString.reverse("ab")); // Expected: "ba"
    }

    // Test for normal string
    @Test
    public void testNormalString() {
        assertEquals("olleh", ReverseString.reverse("hello")); // Expected: "olleh"
    }

    // Test for numeric string
    @Test
    public void testNumericString() {
        assertEquals("54321", ReverseString.reverse("12345")); // Expected: "54321"
    }

    // Test for special characters
    @Test
    public void testSpecialCharacters() {
        assertEquals("!dlroW ,olleH", ReverseString.reverse("Hello, World!")); // Expected: "!dlroW ,olleH"
    }

    // Test for palindrome
    @Test
    public void testPalindrome() {
        assertEquals("racecar", ReverseString.reverse("racecar")); // Expected: "racecar" (same as input)
    }

    // Test for large string (max-)
    @Test
    public void testLargeString() {
        String largeString = "ThisStringIsSuperLongAndIsUsedForTestingPurposesOnlyInThisAssignment";
        String reversed = new StringBuilder(largeString).reverse().toString();
        assertEquals(reversed, ReverseString.reverse(largeString)); // Expected: reversed large string
    }
}
