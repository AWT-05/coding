package org.fundacionjala.coding.lucero;

import java.util.stream.IntStream;

public final class Isograms {

    private Isograms() {
    }

    public static boolean isIsogram(final String word) {
        if (word.length() <= 1) {
            return true;
        }

        IntStream isogramCandidate = word.toLowerCase().chars().distinct().filter(Character::isAlphabetic);

        return isogramCandidate.count() == word.length();
    }
}
