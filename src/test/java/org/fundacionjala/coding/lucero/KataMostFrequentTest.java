package org.fundacionjala.coding.lucero;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KataMostFrequentTest {

    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;

    /**
     * @return an Array of numbers as input data and
     * the most frequent number count.
     */
    @DataProvider(name = "data")
    public Object[][] createData() {
        final int[] group1 = new int[]{1, 1, 2, 2, 3};
        final int[] group2 = new int[]{16, 17, 22, 22, 22, 22, 20, 16};
        final int[] group3 = new int[]{12, 17, 19, 20, 20, 20, 20, 18};
        final int[] group4 = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};

        return new Object[][]{
                {group1, TWO},
                {group2, FOUR},
                {group3, FOUR},
                {group4, FIVE},
        };
    }

    @Test(dataProvider = "data")
    public void findCountMostFrequentItemTest(final int[] data, final int expectedCount) {
        int actualCount = Kata.countMostFrequentItem(data);

        assertEquals(actualCount, expectedCount);
    }

    @Test
    public void countMostFrequentOneItemTest() {
        int[] data = new int[]{THREE};
        int actualCount = Kata.countMostFrequentItem(data);

        assertEquals(actualCount, THREE);
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
