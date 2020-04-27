package org.fundacionjala.coding.mauricio;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HighAndLowKataTest {

    @Test
    public void givenNumbersWhenExpectedHighAndLowThenCompareTheHighestAndLowest() {
        //given
        String input = "3 2 9 3 7 1";
        HighAndLowKata newKata = new HighAndLowKata();
        String actualResult = newKata.highestAndLowest(input);
        //when
        String expectedResult = "9 1";
        //then
        assertEquals(actualResult, expectedResult);
    }
    @Test
    public void givenNegativeNumbersWhenExpectedHighAndLowThenCompareTheHighestAndLowest() {
        //given
        String input = "-3 -2 -9 -3 -7 -1";
        HighAndLowKata newKata = new HighAndLowKata();
        String actualResult = newKata.highestAndLowest(input);
        //when
        String expectedResult = "-1 -9";
        //then
        assertEquals(actualResult, expectedResult);
    }
}