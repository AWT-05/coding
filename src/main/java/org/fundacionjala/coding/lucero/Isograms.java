package org.fundacionjala.coding.lucero;

public final class Isograms {
    private Isograms() {
    }

    public static boolean isIsogram(final String word) {
        if (word.length() <= 1) {
            return true;
        }

        return word.toLowerCase()
                   .chars()
                   .distinct()
                   .filter(Character::isAlphabetic)
                   .count() == word.length();
    }
}
