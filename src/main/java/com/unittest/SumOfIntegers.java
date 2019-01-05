package com.unittest;

    public class SumOfIntegers {
        public int integersum(String string)
        {
            int sum = 0;
            int i=0;
            String[] str1 = string.split(" ");
            while(i<=str1.length)
            {
                sum = sum+ Integer.parseInt(str1[i]);
                i++;
            }
           return sum;
        }
    }








