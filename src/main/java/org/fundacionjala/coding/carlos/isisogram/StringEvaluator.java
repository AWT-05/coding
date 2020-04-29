package org.fundacionjala.coding.carlos.isisogram;

public class StringEvaluator {

    /**
     * @param data is the string to verify
     * @return a boolean verifying if the data is isogram or not
     */
    public boolean verifyIsogram(final String data) {
        int result = 0;
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < data.length(); j++) {
                if ((data.substring(i, i + 1)).equalsIgnoreCase(data.substring(j, j + 1))) {
                    result++;
                }
            }
        }
        return result == data.length();
    }
}
