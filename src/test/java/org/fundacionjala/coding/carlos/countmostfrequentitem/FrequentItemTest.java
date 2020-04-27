package org.fundacionjala.coding.carlos.countmostfrequentitem;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrequentItemTest {

    @Test
    public void givenAnArrayThenCountTheMostFrecuentItem() {
        //given
        int[] numbers = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        CountFrequentItem counter = new CountFrequentItem();
        int currentNumber = counter.getMostFrequent(numbers);
        //when
        int expectedNumber = 5;
        //then
        assertEquals(currentNumber, expectedNumber);
    }
}
