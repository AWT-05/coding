package org.fundacionjala.coding.diego;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public final class Isograms {

    private Isograms() {
    }

    public static boolean stringIsogram(final String word) {
        if (word.length() == 0) {
            return true;
        }
        if (word.chars().anyMatch(Character::isDigit)) {
            return false;
        }
        Set<String> wordSet = Arrays.stream(word.toLowerCase().split("")).collect(Collectors.toSet());

        return word.length() == wordSet.size();
    }
}
