package org.fundacionjala.coding.diego;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class HighAndLowTest {

    @Test
    public void givenASetOfNumbersGetHighestAndLowest() {
        //given
        String numbersInput = "1 2 3 4 5";
        String highestAndLowestActual = HighAndLow.highestAndLowest(numbersInput);
        //when
        String highestAndLowestExpected = "5 1";
        //then
        assertEquals(highestAndLowestActual, highestAndLowestExpected);
    }

    @Test
    public void givenASingleNumberGetHighAndLowWithTheSameValue() {
        //given
        String numbersInput = "3";
        String highestAndLowestActual = HighAndLow.highestAndLowest(numbersInput);
        //when
        String highestAndLowestExpected = "3 3";
        //then
        assertEquals(highestAndLowestActual, highestAndLowestExpected);
    }

    @Test
    public void givenAnOnlySpacesInputGetHighAndLowWithZero() {
        //given
        String numbersInput = "     ";
        String highestAndLowestActual = HighAndLow.highestAndLowest(numbersInput);
        //when
        String highestAndLowestExpected = "2147483647 -2147483648";
        //then
        assertEquals(highestAndLowestActual, highestAndLowestExpected);
    }

    @Test
    public void givenAnEmptyInputGetHighAndLowWithZero() {
        //given
        String numbersInput = "";
        String highestAndLowestActual = HighAndLow.highestAndLowest(numbersInput);
        //when
        String highestAndLowestExpected = "2147483647 -2147483648";
        //then
        assertEquals(highestAndLowestActual, highestAndLowestExpected);
    }

    @Test
    public void givenANullInputGetHighAndLowWithZero() {
        //given
        String highestAndLowestActual = HighAndLow.highestAndLowest(null);
        //when
        String highestAndLowestExpected = "2147483647 -2147483648";
        //then
        assertEquals(highestAndLowestActual, highestAndLowestExpected);
    }
}
