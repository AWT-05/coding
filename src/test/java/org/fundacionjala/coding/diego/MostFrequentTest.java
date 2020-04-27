package org.fundacionjala.coding.diego;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class MostFrequentTest {

    @Test
    public void givenAnArrayOfNumbersGetTheMostFrequentItem() {
        //given
        int[] inputArray = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int expectedMostFrequent = 5;
        //when
        int actualMostFrequent = MostFrequent.countFrequency(inputArray);
        //then
        assertEquals(actualMostFrequent, expectedMostFrequent);
    }

    @Test
    public void givenAnEmptyArrayGetTheMostFrequentItemAsZero() {
        //given
        int[] inputArray = new int[]{};
        int expectedMostFrequent = 0;
        //when
        int actualMostFrequent = MostFrequent.countFrequency(inputArray);
        //then
        assertEquals(actualMostFrequent, expectedMostFrequent);
    }

    @Test
    public void givenANullInputGetTheMostFrequentItemAsZero() {
        //given
        int expectedMostFrequent = 0;
        //when
        int actualMostFrequent = MostFrequent.countFrequency(null);
        //then
        assertEquals(actualMostFrequent, expectedMostFrequent);
    }

    @Test
    public void givenAnArrayOfASingleNumberGetTheMostFrequentItem() {
        //given
        int[] inputArray = new int[]{13};
        int expectedMostFrequent = 1;
        //when
        int actualMostFrequent = MostFrequent.countFrequency(inputArray);
        //then
        assertEquals(actualMostFrequent, expectedMostFrequent);
    }
}
