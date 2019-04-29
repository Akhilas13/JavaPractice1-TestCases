package com.stackroute.tdd;

public class Capital {
    public int letter(Character ch)
    {
        if(Character.isUpperCase(ch))//checking for  uppercase letters
        {
            System.out.println("uppercase");
        }
        else if(Character.isLowerCase(ch))//checking for  lowercase letters
        {
            System.out.println("lowercase");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("digit");//checking for digits
        }
        else{
            System.out.println("special symbol");//checking for special symbols
        }
        return 0;
    }

}
