package org.example;

public class StringProcessor {
    public  boolean isStrongPassword(String password) {
        //1.check length of the password
        if (password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (!Character.isLetter(ch) && !Character.isDigit(ch)  && !Character.isWhitespace(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
    public int calculateDigits(String sentence) {
        int digitCount = 0;

        //check each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            //check if the character is a digit
            if (Character.isDigit(sentence.charAt(i))) {
                digitCount++;
            }
        }
        return digitCount;
    }
}
