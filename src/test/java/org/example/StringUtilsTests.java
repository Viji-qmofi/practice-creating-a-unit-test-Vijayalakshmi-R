package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
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
