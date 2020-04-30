package org.fundacionjala.coding.carlos;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsogramsTest {
    @Test
    public void givenAIsogramStringThenDetermineAsTrue() {
        //given
        String data = "Dermatoglyphics";
        Isograms isograms = new Isograms();
        //then
        assertTrue(isograms.verifyIsogram(data));
    }
    @Test
    public void givenAIsogramStringThenDetermineAsFalse() {
        //given
        String data = "basketBall";
        Isograms isograms = new Isograms();
        //then
        assertFalse(isograms.verifyIsogram(data));
    }
    @Test
    public void givenAEmptyIsogramStringThenDetermineAsStrue() {
        //given
        String data = " ";
        Isograms isograms = new Isograms();
        //then
        assertTrue(isograms.verifyIsogram(data));
    }
}
