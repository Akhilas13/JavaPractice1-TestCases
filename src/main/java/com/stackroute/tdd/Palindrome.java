package com.stackroute.tdd;


public class Palindrome {
    int sum = 0;

    public int palindromeMethod(int number) {
        int temporary, reverse = 0, remainder, x;
        temporary = number;//assign the number to a temporary variable
        while (number != 0) //reversing the number
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (temporary == reverse) //checks for palindrome
        {
            do {
                x = temporary % 10;
                if ((x % 2) == 0)//checks for even
                {
                    sum = sum + x;//sum the even numbers
                }
                temporary = temporary / 10;
            } while (temporary != 0);
            if(sum>25) {//check for condition if sum is greater than 25
                System.out.printf("it palindrome and sum of even numbers is greater than 25\n", sum);
            }
            else{//condition fails
                System.out.printf("it is palindrome and sum of even numbers is less than 25 \n",sum);
            }


        } else {
            System.out.println("it is not palindrome");

        }
        return (sum);


    }
}

