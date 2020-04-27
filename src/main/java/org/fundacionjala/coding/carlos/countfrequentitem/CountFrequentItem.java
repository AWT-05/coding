package org.fundacionjala.coding.carlos.countfrequentitem;

public class CountFrequentItem {
    public int getMostFrequent(int[] arrayNumbers) {
        int number = 0, repeated = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            number = arrayNumbers[i];
            if (repeated < verifyFrequensy(number, arrayNumbers)) {
                repeated = verifyFrequensy(number, arrayNumbers);
            }
        }
        return repeated;
    }

    private int verifyFrequensy(int number, int[] arrayNumbers) {
        int freqCounter = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (number == arrayNumbers[i]) {
                freqCounter++;
            }
        }
        return freqCounter;
    }
}
