package org.fundacionjala.coding.lucero;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KataMostFrequentTest {
    @Test
    public void findCountMostFrequentItemTest() {
        int expectedCount = 5;
        int[] data = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int actualCount = Kata2.countMostFrequentItem(data);

        assertEquals(actualCount, expectedCount);
    }

    @Test
    public void handleEmptyArrayTest() {
        int expectedCount = 0;
        int[] data = new int[]{};
        int actualCount = Kata2.countMostFrequentItem(data);

        assertEquals(actualCount, expectedCount);
    }

    @Test
    public void CountMostFrequentOneItemTest() {
        int expectedCount = 3;
        int[] data = new int[]{3};
        int actualCount = Kata2.countMostFrequentItem(data);

        assertEquals(actualCount, expectedCount);
    }
}
