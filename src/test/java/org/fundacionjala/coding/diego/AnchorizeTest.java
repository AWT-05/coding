package org.fundacionjala.coding.diego;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AnchorizeTest {

    @Test
    public void givenAFtpUriWhenAnchorizeThenCorrect() {
        //given
        String uri = "hello FTP://world.com !";
        //when
        String expectedAnchorString = "hello <a href=\"FTP://world.com\">FTP://world.com</a> !";
        String actualAnchorString = anchorUri(uri);
        //then
        assertEquals(actualAnchorString,expectedAnchorString);
    }

    @Test
    public void givenAHttpUriWhenAnchorizeThenCorrect() {
        //given
        String uri = "hello http://world.com !";
        //when
        String expectedAnchorString = "hello <a href=\"http://world.com\">http://world.com</a> !";
        String actualAnchorString = anchorUri(uri);
        //then
        assertEquals(actualAnchorString,expectedAnchorString);
    }
}
