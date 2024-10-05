package org.example;

public class StringProcessor {
    public  boolean isStrongPassword(String password) {
        //checking length of the password
        if (password.length() < 8) {
            return false;
        }
        // setting boolen to false
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        // then if the password has upper case, lower case,digit, spcial number changing boolean to true
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
        //return if all 4 conditions true
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
    public int calculateDigits(String sentence) {
        //initially setting digit count to 0
        int digitCount = 0;

        //check each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            //check if the character is a digit
            if (Character.isDigit(sentence.charAt(i))) {
                digitCount++;// adding 1 to digitCout if we have digits in the sentence
            }
        }
        return digitCount;
    }
    public int calculateWords(String sentence) {
        //case when we dont have any words in the sentence
        if (sentence == null || sentence.length() == 0) {
            return 0;
        }
        //case with words
                int wordCount = 1;//because there is no white space when we have only 1 word in the sentence
                for (int i = 0; i < sentence.length(); i++) {//loop goes through evere character looking for the white space
                    if (Character.isWhitespace(sentence.charAt(i))) {
                        wordCount++; //if there is white space we assume that there are more than 1 word and add to wordCount
                    }
                }return wordCount;
    }
}
