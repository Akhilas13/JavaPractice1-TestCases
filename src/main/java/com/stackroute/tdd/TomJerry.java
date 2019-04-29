package com.stackroute.tdd;

public class TomJerry {
    public static String name(int number) {
        String s;

        if ((number % 2 == 0) && (number > 20) && (number < 30))//checks number is even and exists between 20 and 30
        {
            System.out.println("Jerry");
             return "Jerry";
        } else if ((number % 2 != 0) & (number > 20) && (number < 30))//checks number is odd and exists between 20 and 30
        {
            System.out.println("Tom");
            return "Tom";
        } else {
            System.out.println("error");
            return "error";
        }
    }
}




