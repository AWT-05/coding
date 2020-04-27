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
        String joinDefault = String.join(" ",
                Integer.toString(Integer.MAX_VALUE),
                Integer.toString(Integer.MIN_VALUE));
        if (numbers == null || numbers.isEmpty()) {
            return joinDefault;
        }
        String[] numbersArray = numbers.split(" ");
        if (numbersArray.length < 1) {
            return joinDefault;
        }
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
