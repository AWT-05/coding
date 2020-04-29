package org.fundacionjala.coding.lucero;

import java.util.HashSet;
import java.util.Set;

public final class Isograms {
    private Isograms() {
    }

    public static boolean isIsogram(final String word) {
        if (word.length() <= 1) {
            return true;
        }

        String isogramCandidate = word.toLowerCase();
        Set<Character> helperSet = new HashSet<>();

        for (int i = 0; i < isogramCandidate.length(); i++) {
            char letter = isogramCandidate.charAt(i);

            if (Character.isDigit(letter) || !helperSet.add(letter)) {
                return false;
            }
        }

        return true;
    }
}
