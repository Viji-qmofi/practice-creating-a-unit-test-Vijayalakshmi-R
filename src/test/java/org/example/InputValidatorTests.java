package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

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
