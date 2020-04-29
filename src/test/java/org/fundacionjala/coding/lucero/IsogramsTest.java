package org.fundacionjala.coding.lucero;

import org.testng.annotations.Test;

import static org.fundacionjala.coding.lucero.Isograms.isIsogram;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsogramsTest {

    @Test
    public void isIsogramsTest() {
        boolean result = isIsogram("word");

        assertTrue(result);
    }

    @Test
    public void isIsogramsWhenEmptyTest() {
        boolean result = isIsogram("");

        assertTrue(result);
    }

    @Test
    public void isNotIsogramsTest() {
        boolean result = isIsogram("aba");

        assertFalse(result);
    }

    @Test
    public void isNotIsogramsInsensitiveCaseTest() {
        boolean result = isIsogram("moOse");

        assertFalse(result);
    }

    @Test
    public void isNotIsogramsWhenNumbersTest() {
        boolean result = isIsogram("Dermatoglyphics1");

        assertFalse(result);
    }
}
