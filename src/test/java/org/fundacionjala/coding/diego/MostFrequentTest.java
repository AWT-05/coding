package org.fundacionjala.coding.diego;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class MostFrequentTest {

    public static final int[] INPUT_ARRAY = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
    public static final int[] INPUT_FOR_SINGLE = new int[]{13};
    public static final int EXPECTED_FROM_ARRAY = 5;
    public static final int EXPECTED_FROM_EMPTY_OR_NULL = 0;
    public static final int EXPECTED_FROM_SINGLE = 1;

    @Test
    public void givenAnArrayOfNumbersGetTheMostFrequentItem() {
        //when
        int actualMostFrequent = MostFrequent.countFrequency(INPUT_ARRAY);
        //then
        assertEquals(actualMostFrequent, EXPECTED_FROM_ARRAY);
    }

    @Test
    public void givenAnEmptyArrayGetTheMostFrequentItemAsZero() {
        //given
        int[] inputArray = new int[]{};
        //when
        int actualMostFrequent = MostFrequent.countFrequency(inputArray);
        //then
        assertEquals(actualMostFrequent, EXPECTED_FROM_EMPTY_OR_NULL);
    }

    @Test
    public void givenANullInputGetTheMostFrequentItemAsZero() {
        //when
        int actualMostFrequent = MostFrequent.countFrequency(null);
        //then
        assertEquals(actualMostFrequent, EXPECTED_FROM_EMPTY_OR_NULL);
    }

    @Test
    public void givenAnArrayOfASingleNumberGetTheMostFrequentItem() {
        //when
        int actualMostFrequent = MostFrequent.countFrequency(INPUT_FOR_SINGLE);
        //then
        assertEquals(actualMostFrequent, EXPECTED_FROM_SINGLE);
    }
}
