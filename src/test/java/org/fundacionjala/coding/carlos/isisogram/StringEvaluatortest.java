package org.fundacionjala.coding.carlos.isisogram;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class StringEvaluatortest {
    @Test
    public void givenAIsogramStringThenDetermineAsTrue() {
        //given
        String data = "Dermatoglyphics";
        StringEvaluator isogram = new StringEvaluator();
        //then
        assertTrue(isogram.verifyIsogram(data));
    }
    @Test
    public void givenAIsogramStringThenDetermineAsFalse() {
        //given
        String data = "basketBall";
        StringEvaluator isogram = new StringEvaluator();
        //then
        assertFalse(isogram.verifyIsogram(data));
    }
    @Test
    public void givenAEmptyIsogramStringThenDetermineAsStrue() {
        //given
        String data = " ";
        StringEvaluator isogram = new StringEvaluator();
        //then
        assertTrue(isogram.verifyIsogram(data));
    }
}
