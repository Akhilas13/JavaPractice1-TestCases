package com.stackroute.tdd;

public class Loop {

    public int pattern(int number)
    {
        int i,j;
        for (i = 1; i <= number; i++)
        {
            for (j = 0; j < i; j++)
            {
                System.out.print(i);
            }

        }
        if(number==0){
            System.out.println("");
            System.out.println("failure");
        }
        return 0;

    }
}
