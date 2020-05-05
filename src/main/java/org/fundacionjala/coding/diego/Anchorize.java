package org.fundacionjala.coding.diego;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Anchorize {

    private Anchorize() {
    }

    public static String anchorUri(final String message) {
        String strRegex = "(((https?|FTP|smb|file):(//)+)+[\\w\\d:#@%/;$()~_?+-=\\\\.&]*)";
        String anchorized = "";
        if (message == null) {
            return "";
        }
        StringBuffer str = new StringBuffer(message.length());
        Pattern pattern = Pattern.compile(strRegex);
        Matcher matcher = pattern.matcher(message);

        // Replace urls with anchor tags to the url
        while (matcher.find()) {
            String url = matcher.group(0);
            matcher.appendReplacement(str, Matcher.quoteReplacement("<a href=\"" + url + "\">" + url + "</a>"));
        }
        matcher.appendTail(str);
        anchorized = str.toString();
        return anchorized;
    }
}
