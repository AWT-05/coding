package org.fundacionjala.lucero;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Kata {

    private Kata() { }

    public static List<Integer> recoverNumbers(final String data) {
        Stream<Integer> numbers = Arrays.stream(data.split(" "))
                .map(Integer::parseInt);
        return numbers.collect(Collectors.toList());
    }

    public static String highAndLow(final String data) {
        if (data.isEmpty() || data.length() == 1) {
            return data;
        }

        List<Integer> numbers = recoverNumbers(data);

        Collections.sort(numbers);
        return buildResult(numbers.get(numbers.size() - 1), numbers.get(0));
    }

    private static String buildResult(final Integer high, final Integer low) {
        return high.toString() + " " + low.toString();
    }
}
