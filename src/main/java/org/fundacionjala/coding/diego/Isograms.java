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

        Set<String> wordSet = Arrays.stream(word.toLowerCase().split("")).collect(Collectors.toSet());

        if (wordSet.stream().anyMatch(s -> s.matches(".*\\d.*"))) {
            return false;
        }
        return word.length() == wordSet.size();
    }
}
