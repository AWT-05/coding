package org.fundacionjala.coding.mauricio;

public final class Isogram {

    private Isogram() {
    }

    public static boolean validateIsogram(final String word) {

        boolean result = false;
        if (word.length() == 0) {
            result = true;
        }

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if ((word.charAt(i) == word.charAt(j)) && (i != j)) {
                    result = false;
                    return result;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }
}
