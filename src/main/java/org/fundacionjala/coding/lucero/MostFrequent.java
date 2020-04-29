package org.fundacionjala.coding.lucero;

import java.util.HashMap;
import java.util.Map;

public final class MostFrequent {

    private MostFrequent() {
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
}
