package org.example;

public class StringUtils {
    public int countCodeLikeWords(String input) {
        int count = 0;

        for (int i = 0; i <= input.length() - 4; i++) {
            if (input.startsWith("co", i) && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
