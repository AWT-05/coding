package org.fundacionjala.coding.carlos.countfrequentitem;

public class CountFrequentItem {

    /**
     * @param arrayNumbers to find the most frequent item
     * @return the number of times that the most frequent item is repeated in an array.
     */
    public int getMostFrequent(final int[] arrayNumbers) {
        int number = 0;
        int repeated = 0;
        for (int arrayNumber : arrayNumbers) {
            number = arrayNumber;
            if (repeated < verifyFrequency(number, arrayNumbers)) {
                repeated = verifyFrequency(number, arrayNumbers);
            }
        }
        return repeated;
    }

    private int verifyFrequency(final int number, final int[] arrayNumbers) {
        int freqCounter = 0;
        for (int arrayNumber : arrayNumbers) {
            if (number == arrayNumber) {
                freqCounter++;
            }
        }
        return freqCounter;
    }
}
