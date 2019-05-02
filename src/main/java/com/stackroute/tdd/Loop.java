package com.stackroute.tdd;

public class Loop {

    public int pattern(int number)
    {
        int i,j;
        for (i = 1; i <= number; i++)//program to print the pattern using loop
        {
            for (j = 0; j < i; j++)
            {
                System.out.print(i);
            }

        }
        if(number==0){//if number is equal to zero print failure
            System.out.println("");
            System.out.println("failure");
        }
        return 0;

    }
}
