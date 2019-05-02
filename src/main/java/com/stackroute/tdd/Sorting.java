package com.stackroute.tdd;

public class Sorting {
        public int sum(int number)
        {
            int a[];
            a = new int[20];
            int i = 0, count = 0, j, x, k;
            int sum = 0;
            while (number != 0)//assigning the number to array
            {
                a[i] = number % 10;
                number = number / 10;
                i = i + 1;
                count = count + 1;
            }
            for (k = 0; k < count - 1; k++)//sort the array in decreasing order
            {
                for (j = 0; j < count - k - 1; j++)
                {
                    if (a[j] < a[j + 1])
                    {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }

            }
            for (x = 0; x < count; x++)
            {
                System.out.print(a[x]);
                if (a[x] % 2 == 0)//checks for even
                {
                    sum = sum + a[x];
                }
            }
            System.out.println("");

            if (sum > 15) //checks for sum greater than 15
            {
                System.out.println("true");
                return 1;

            }
            else
            {
                System.out.println("false");
                return 0;

            }



        }

    }




