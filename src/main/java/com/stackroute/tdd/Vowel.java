package com.stackroute.tdd;

public class Vowel {


    public int letter(String alphabet) {
        int i;
        int len = alphabet.length();
        for (i = 0; i < len; i++) {
            char ch = alphabet.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') //checks for vowels
            {
                System.out.println("vowel ");

            } else if (Character.isDigit(ch))//error message for digits
            {
                System.out.println("error ");

            } else {
                System.out.println("consonant ");

            }
        }
        return 0;

    }

}
