package org.fundacionjala.coding.diego;

import static org.fundacionjala.coding.diego.Isograms.stringIsogram;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class IsogramsTest {

    @Test
    public void givenAnStringWhenIsIsogramThenTrue() {
        boolean isIsogram = stringIsogram("word");
        assertTrue(isIsogram);
    }

    @Test
    public void givenAnStringWhenIsNotIsogramThenFalse() {
        boolean isIsogram = stringIsogram("aba");
        assertFalse(isIsogram);
    }

    @Test
    public void givenAnStringWithUpperCaseWhenIsIsogramThenTrue() {
        boolean isIsogram = stringIsogram("Dermatoglyphics");
        assertTrue(isIsogram);
    }

    @Test
    public void givenAnStringWithUpperCaseWhenIsNotIsogramThenFalse() {
        boolean isIsogram = stringIsogram("moOse");
        assertFalse(isIsogram);
    }

    @Test
    public void givenAnEmptyStringWhenIsIsogramThenTrue() {
        boolean isIsogram = stringIsogram("");
        assertTrue(isIsogram);
    }

    @Test
    public void givenAnStringWithANumberThenFalse() {
        boolean isIsogram = stringIsogram("Number8");
        assertFalse(isIsogram);
    }

}
