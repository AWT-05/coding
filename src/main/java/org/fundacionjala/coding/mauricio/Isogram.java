package org.fundacionjala.coding.mauricio;

public class Isogram {

    public static boolean stringIsogram(final String word) {
        if (word.length() == 0) {
            return true;
        }

        for (int i = 0; i <= word.length(); i++) {
            for (int j = 0; j <= word.length(); j++) {
                if ((word.charAt(i) == word.charAt(j)) && (i != j)) {
                    return true;
                }
            }
        }

        return false;
    }
}