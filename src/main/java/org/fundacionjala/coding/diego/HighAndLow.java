package org.fundacionjala.coding.diego;

public final class HighAndLow {

    private HighAndLow() {
    }

    /**
     * Retrieves both the highest and the lowest number from an input given.
     *
     * @param numbers separated by a space character.
     * @return a string containing highest and lowest number.
     */
    public static String highestAndLowest(final String numbers) {
        int highestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;
        String[] numbersArray = numbers.split(" ");
        for (String number : numbersArray) {
            highestNumber = Math.max(Integer.parseInt(number),
                    highestNumber);
            lowestNumber = Math.min(Integer.parseInt(number),
                    lowestNumber);
        }
        return String.join(" ",
                Integer.toString(highestNumber),
                Integer.toString(lowestNumber));
    }

}
