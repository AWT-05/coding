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
        String numbersInput = "13";
        String highestAndLowestActual = HighAndLow.highestAndLowest(numbersInput);
        //when
        String highestAndLowestExpected = "13 13";
        //then
        assertEquals(highestAndLowestActual, highestAndLowestExpected);
    }

}
