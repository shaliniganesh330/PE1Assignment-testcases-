package com.unittest;

import java.util.Scanner;

public class PrintPattern {
     String pattern_1(int num)
    {
        int i,j;
        String string = "";
        for(i=1;i<=num;i++)
        {
            for (j = 1; j <= i; j++)
            {
                string+=i;
            }
        }
        return string;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();

        PrintPattern lp = new PrintPattern();
        System.out.println(lp.pattern_1(n));
    }

}