package org.fundacionjala.coding.lucero;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KataMostFrequentTest {

    static final int FIVE = 5;

    @Test
    public void findCountMostFrequentItemTest() {
        final int[] data = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actualCount = Kata.countMostFrequentItem(data);

        assertEquals(actualCount, FIVE);
    }

    @Test
    public void countMostFrequentOneItemTest() {
        int[] data = new int[]{FIVE};
        int actualCount = Kata.countMostFrequentItem(data);

        assertEquals(actualCount, FIVE);
    }

    @Test
    public void handleEmptyArrayTest() {
        int expectedCount = 0;
        int[] data = new int[]{};
        int actualCount = Kata.countMostFrequentItem(data);

        assertEquals(actualCount, expectedCount);
    }

    @Test
    public void handleNullInputDataTest() {
        int expectedCount = 0;
        int actualCount = Kata.countMostFrequentItem(null);

        assertEquals(actualCount, expectedCount);
    }
}
