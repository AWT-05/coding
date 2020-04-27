package org.fundacionjala.coding.mauricio;

import java.util.List;
import java.util.Collections;
import java.util.List;

public final class HighAndLowKata {

    public static List<Integer> convertToNumbers(final String input_data) {
        List<Integer> numbersArray = new ArrayList<>();
        String[] chars_split = input_data.split(" ");
        for (String number : chars_split) {
            numbersArray.add(Integer.parseInt(number));
        }
        return numbersArray;

    }
    public static List<Integer> recoverNumbers(final String data) {
        Stream<Integer> numbers = Arrays.stream(data.split(" "))
                .map(Integer::parseInt);
        return numbers.collect(Collectors.toList());
    }

    public String highestAndLowest(final String input_numbers) {
        String high;
        String low;
        if (numbers == null || numbers.isEmpty()) {
            return "Null";
        }
        if (numbers.isEmpty()) {
            return "Empty";
        }
        if (input_numbers.length() <= 1) {
            return input_numbers;
        }
        List<Integer> numbersList = convertToNumbers(input_numbers);
        int highest = Collections.max(numbersList);
        int lowest = Collections.min(numbersList);
        return String.join(" ",
                Integer.toString(highest),
                Integer.toString(lowest));
    }
}