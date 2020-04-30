package org.fundacionjala.coding.carlos.countfrequentitem;

import java.util.HashMap;
import java.util.Map;

public class CountFrequentItem {

    /**
     * @param arrayNumbers to find the most frequent item
     * @return the number of times that the most frequent item is repeated in an array.
     */
    public int getMostFrequent(final int[] arrayNumbers) {
        int repeated = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int arrayNumber : arrayNumbers) {
            counter.merge(arrayNumber, 1, Integer::sum);
            if (repeated < counter.get(arrayNumber)) {
                repeated = counter.get(arrayNumber);
            }
        }
        return repeated;
    }
}
