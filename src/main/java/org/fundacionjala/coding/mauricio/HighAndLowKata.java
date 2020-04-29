package org.fundacionjala.coding.mauricio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class HighAndLowKata {

    public static List<Integer> convertToNumbers(final String inputData) {
        List<Integer> numbersArray = new ArrayList<>();
        String[] charsSplit = inputData.split(" ");
        for (String number : charsSplit) {
            numbersArray.add(Integer.parseInt(number));
        }
        return numbersArray;

    }

    public static List<Integer> recoverNumbers(final String data) {
        Stream<Integer> numbers = Arrays.stream(data.split(" "))
                .map(Integer::parseInt);
        return numbers.collect(Collectors.toList());
    }

    public String highestAndLowest(final String inputNumbers) {
        String high;
        String low;
        if (inputNumbers == null || inputNumbers.isEmpty()) {
            return "Null";
        }
        if (inputNumbers.isEmpty()) {
            return "Empty";
        }
        if (inputNumbers.length() <= 1) {
            return inputNumbers;
        }
        List<Integer> numbersList = convertToNumbers(inputNumbers);
        int highest = Collections.max(numbersList);
        int lowest = Collections.min(numbersList);
        return String.join(" ",
                Integer.toString(highest),
                Integer.toString(lowest));
    }
}
