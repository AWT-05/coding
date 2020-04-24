package org.fundacionjala.coding;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Library test class.
 */
public class LibraryTest {

    /**
     * Verify some library method.
     */
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
