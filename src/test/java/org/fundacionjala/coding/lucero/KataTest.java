package org.fundacionjala.coding.lucero;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KataTest {

    @Test
    public void recoverNumbersTest() {
        List<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(1);
        expectedNumbers.add(2);
        List<Integer> actualNumbers = Kata.recoverNumbers("1 2");

        assertTrue(expectedNumbers.containsAll(actualNumbers));
    }

    /**
     * @return a string of numbers as input data and
     * the high and low expected numbers.
     */
    @DataProvider(name = "data")
    public Object[][] createData() {
        return new Object[][] {
            {"1 2 3 4 5",   "5 1"},
            {"1 2 -3 4 5",  "5 -3"},
            {"1 9 3 4 -5",  "9 -5"}
        };
    }

    @Test(dataProvider = "data")
    public void highAndLowTest(final String data, final String expectedHighLow) {
        String actualHighLow = Kata.highAndLow(data);

        assertEquals(actualHighLow, expectedHighLow);
    }

    @Test
    public void getHighLowOfOneNumberTest() {
        String expectedHighLow = "5";
        String actualHighLow = Kata.highAndLow("5");

        assertEquals(actualHighLow, expectedHighLow);
    }

    @Test
    public void getHighLowOfZeroNumbersTest() {
        String expectedHighLow = "";
        String actualHighLow = Kata.highAndLow("");

        assertEquals(actualHighLow, expectedHighLow);
    }

    @Test
    public void handleNullInputTest() {
        String expectedHighLow = "";
        String actualHighLow = Kata.highAndLow(null);

        assertEquals(actualHighLow, expectedHighLow);
    }
}
