package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
//The test class mirrors the name of the class being tested (with Test at the end)
//The test method name clearly describes what is being tested
//The test can run independently and doesn’t rely on other tests
//There is at least one test for the normal (“happy path”) case
//There is at least one test for an edge case or unusual input
//The test uses appropriate assertions to verify behavior

public class InputValidatorTests {
    @Test
    public void isValidUserName_returnsTrue(){
        InputValidator validator = new InputValidator();
        assertTrue(validator.isValidUserName("VRamu"));
    }
    @Test
    public void isValidUserName_returnsFalse(){
        InputValidator validator = new InputValidator();
        assertFalse(validator.isValidUserName(null));
    }

}
