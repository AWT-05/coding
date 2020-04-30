package org.fundacionjala.coding.carlos;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Isograms {

    /**
     * @param data is the string to verify
     * @return a boolean verifying if the data is isogram or not
     */
    public boolean verifyIsogram(final String data) {
        if (data.length() < 1) {
            return true;
        }
        Set<String> setdata = new LinkedHashSet<>(Arrays.asList(data.toLowerCase().split("")));
        return setdata.size() == data.length();
    }
}
