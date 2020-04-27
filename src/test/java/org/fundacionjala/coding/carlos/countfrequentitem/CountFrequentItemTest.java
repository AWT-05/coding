package org.fundacionjala.coding.carlos.countfrequentitem;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountFrequentItemTest {
    public static final int[] ARRAY_NUMBERS = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
    public static final int EXPECTED_NUMBER = 5;

    @Test
    public void givenAnArrayThenCountTheMostFrecuentItem() {
        //given
        CountFrequentItem counter = new CountFrequentItem();
        int currentNumber = counter.getMostFrequent(ARRAY_NUMBERS);
        //then
        assertEquals(currentNumber, EXPECTED_NUMBER);
    }

    @Test
    public void givenAnEmptyArrayThenCountTheMostFrecuentItem() {
        //given
        int[] emptyArray = new int[]{};
        CountFrequentItem counter = new CountFrequentItem();
        int currentNumber = counter.getMostFrequent(emptyArray);
        //when
        int expectedNumber = 0;
        //then
        assertEquals(currentNumber, expectedNumber);
    }
}
