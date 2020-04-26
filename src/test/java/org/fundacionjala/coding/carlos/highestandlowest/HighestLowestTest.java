package org.fundacionjala.coding.carlos.highestandlowest;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class HighestLowestTest {

    @Test
    public void givenStringOfNumbersThenReturnAListOfNumbers(){
        //given
        String numbers= "8 -6 7 5";
        CalculateNumbers calcNumbers = new CalculateNumbers();
        List<Integer> currentNumbersLists = calcNumbers.colectNumbers(numbers);
        //when
        List<Integer> expectedNumbersList = new ArrayList<>();
        expectedNumbersList.add(8);
        expectedNumbersList.add(-6);
        expectedNumbersList.add(7);
        expectedNumbersList.add(5);
        //then
        assertArrayEquals(expectedNumbersList.toArray(), currentNumbersLists.toArray());
        assertEquals(expectedNumbersList, currentNumbersLists);
    }

    @Test
    public void givenStringOfNumbersWhenCompareThenReceiveTheHighestAndLowest(){
        //given
        String numbers= "2 -5 3 9 4";
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        String numbersActual= calculateNumbers.highestAndLowest(numbers);
        //when
        String numbersExpected= "9 -5";
        //then
        assertEquals(numbersActual,numbersExpected);
    }
    @Test
    public void givenStringWithNumberWhenCompareThenReceiveTheSameNumber(){
        //given
        String numbers= "7";
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        String numbersActual= calculateNumbers.highestAndLowest(numbers);
        //when
        String numbersExpected= "7";
        //then
        assertEquals(numbersActual,numbersExpected);
    }
    @Test
    public void givenAEmptyStringWhenCompareThenReceiveTheSameNumber(){
        //given
        String numbers= " ";
        CalculateNumbers calculateNumbers = new CalculateNumbers();
        String numbersActual= calculateNumbers.highestAndLowest(numbers);
        //when
        String numbersExpected= " ";
        //then
        assertEquals(numbersActual,numbersExpected);
    }
}
