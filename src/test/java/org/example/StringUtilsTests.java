package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

//The test class mirrors the name of the class being tested (with Test at the end)
//The test method name clearly describes what is being tested
//The test can run independently and doesn’t rely on other tests
//There is at least one test for the normal (“happy path”) case
//There is at least one test for an edge case or unusual input
//The test uses appropriate assertions to verify behavior

public class StringUtilsTests {
    @Test
    public void countCodeLikeWords_countsMatches_correctly() {
        StringUtils utils = new StringUtils();
        assertEquals(2, utils.countCodeLikeWords("cozexxcope"));
    }
    @Test
    public void countCodeLikeWords_returnsZero_forShortString() {
        StringUtils utils = new StringUtils();
        assertEquals(0, utils.countCodeLikeWords("co"));
    }
}
