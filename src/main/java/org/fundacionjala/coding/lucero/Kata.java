package org.fundacionjala.coding.lucero;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Kata {

    private Kata() {
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
