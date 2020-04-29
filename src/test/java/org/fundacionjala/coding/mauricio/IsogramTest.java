package org.fundacionjala.coding.mauricio;

import org.testng.annotations.Test;

import static org.fundacionjala.coding.mauricio.Isogram.validateIsogram;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsogramTest {

    @Test
    public void validateIsogramTest() {
        boolean result = validateIsogram("isogram");
        assertTrue(result);
    }

    @Test
    public void validateIsogramWhenEmpty() {
        boolean result = validateIsogram("");
        assertTrue(result);
    }

    @Test
    public void validateIsogramWhenFalse() {
        boolean result = validateIsogram("hello");
        assertFalse(result);
    }
}
