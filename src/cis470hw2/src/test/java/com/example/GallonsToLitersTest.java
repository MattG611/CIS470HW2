package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GallonsToLitersTest {

    // Valid input tests
    @Test
    public void testZeroGallons() {
        assertEquals(0, GallonsToLiters.convert(0), 0.000001, "0 gallons/week should convert to 0 liters/week.");
    }

    @Test
    public void testSmallPositiveGallons() {
        assertEquals(0.378541, GallonsToLiters.convert(0.1), 0.000001,
                "0.1 gallons/week should convert to approximately 0.378541 liters/week.");
    }

    @Test
    public void testLargePositiveGallons() {
        assertEquals(3785.031459, GallonsToLiters.convert(999.9), 0.00001,
                "999.9 gallons/week should convert to approximately 3785.031459 liters/week.");
    }

    @Test
    public void testMaxGallons() {
        assertEquals(3785.41, GallonsToLiters.convert(1000), 0.0001,
                "1000 gallons/week should convert to 3785.41 liters/week.");
    }

    // Invalid input tests
    @Test
    public void testNegativeGallons() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            GallonsToLiters.convert(-1);
        });
        assertEquals("Invalid input: Gallons per week must be greater than zero.", exception.getMessage(),
                "Negative input should raise an error.");
    }

    @Test
    public void testNonNumericInput() {
        // Simulating a non-numeric input scenario
        try {
            // Simulate a non-numeric input scenario
            String nonNumeric = "abc";
            Double.parseDouble(nonNumeric); // This will throw NumberFormatException
            fail("Expected exception was not thrown.");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"abc\"", e.getMessage(),
                    "Non-numeric input should raise a NumberFormatException.");
        }
    }
}
