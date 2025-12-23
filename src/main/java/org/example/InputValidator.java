package org.example;

public class InputValidator {
    public boolean isValidUserName(String userName){
        return userName != null && userName.length() >= 5;
    }
}
