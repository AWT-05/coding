package org.fundacionjala.coding.carlos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {

    /**
     * @param numbers to collect from a given string
     * @return a list of numbers inside the string numbers
     */
    private List<Integer> collectNumbers(final String numbers) {
        List<Integer> numbersList = new ArrayList<>();
        String[] splitNumbers = numbers.split(" ");
        for (String splitNumber : splitNumbers) {
            numbersList.add(Integer.parseInt(splitNumber));
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
        String highest = Integer.toString(Collections.max(numbersList));
        String lowest = Integer.toString(Collections.min(numbersList));
        //return highest + " " + lowest;
        return String.join(" ", highest, lowest);
    }
}
