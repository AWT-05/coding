package org.fundacionjala.coding.carlos.highestandlowest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculateNumbers {

    /**
     * @param numbers to collect from a given string
     * @return a list of numbers inside the string numbers
     */
    private List<Integer> collectNumbers(final String numbers) {
        List<Integer> numbersList = new ArrayList<>();
        String[] splitNumbers = numbers.split(" ");
        for (int i = 0; i < splitNumbers.length; i++) {
            numbersList.add(Integer.parseInt(splitNumbers[i]));
        }
        return numbersList;
    }

    /**
     * @param numbers to get the highest and lowest
     * @return two numbers the highest and lowest, the highest always comes first
     */
    public String highestAndLowest(final String numbers) {
       if (numbers.length() <= 1) {
           return numbers;
       }
       List<Integer> numbersList = collectNumbers(numbers);
       Collections.sort(numbersList);
       int highest = numbersList.get(numbersList.size() - 1);
       int lowest = numbersList.get(0);
       return highest + " " + lowest;
    }
}
