package org.fundacionjala.coding.carlos.highestandlowest;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HighestLowestTest {

    @Test
    public void givenStringOfNumbersWhenCompareThenReceiveTheHighestAndLowest() {
        //given
        String numbers = "2 -5 3 9 4";
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        String numbersActual = calculateNumbers.highestAndLowest(numbers);
        //when
        String numbersExpected = "9 -5";
        //then
        assertEquals(numbersActual, numbersExpected);
    }
    @Test
    public void givenStringWithNumberWhenCompareThenReceiveTheSameNumber() {
        //given
        String numbers = "7";
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        String numbersActual = calculateNumbers.highestAndLowest(numbers);
        //when
        String numbersExpected = "7";
        //then
        assertEquals(numbersActual, numbersExpected);
    }
    @Test
    public void givenAEmptyStringWhenCompareThenReceiveTheSameNumber() {
        //given
        String numbers = " ";
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        String numbersActual = calculateNumbers.highestAndLowest(numbers);
        //when
        String numbersExpected = " ";
        //then
        assertEquals(numbersActual, numbersExpected);
    }
}
