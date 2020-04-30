package org.fundacionjala.coding.diego;

import java.util.HashMap;
import java.util.Map;

public final class MostFrequent {

    private MostFrequent() {
    }

    /**
     * Obtains the count of the most frequent item of an array.
     *
     * @param inputArray array of integers.
     * @return number of most frequent item.
     */
    public static int countFrequency(final int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return 0;
        }

        int mostFrequent = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : inputArray) {
            frequencyMap.merge(number, 1, Integer::sum);
            if (frequencyMap.get(number) > mostFrequent) {
                mostFrequent = frequencyMap.get(number);
            }
        }
        return mostFrequent;
    }
}
