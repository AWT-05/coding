package org.fundacionjala.coding.lucero;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static int countMostFrequentItem(int[] data) {
        if (data.length == 0) {
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
