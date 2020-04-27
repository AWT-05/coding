package org.fundacionjala.coding.lucero;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Kata {

    private Kata() {
    }

    public static int countMostFrequentItem(final int[] data) {
        if (data == null || data.length == 0) {
            return 0;
        } else if (data.length == 1) {
            return data[0];
        }

        Map<Integer, Integer> countFrequent = new HashMap<>();
        int max = 0;

        for (int number : data) {
            int total = countFrequent.getOrDefault(number, 0) + 1;
            if (total > max) {
                max = total;
            }
            countFrequent.put(number, total);
        }
        return max;
    }

    public static List<Integer> recoverNumbers(final String data) {
        Stream<Integer> numbers = Arrays.stream(data.split(" "))
                .map(Integer::parseInt);
        return numbers.collect(Collectors.toList());
    }

    public static String highAndLow(final String data) {
        if (data == null) {
            return "";
        } else if (data.length() <= 1) {
            return data;
        }
        List<Integer> numbers = recoverNumbers(data);
        int high = Collections.max(numbers);
        int low = Collections.min(numbers);

        return buildResult(high, low);
    }

    private static String buildResult(final Integer high, final Integer low) {
        return String.join(" ", high.toString(), low.toString());
    }
}
