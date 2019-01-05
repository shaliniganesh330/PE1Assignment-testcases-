package com.unittest;

public class SortingTheNumbers {
    public int sorting(int  arr)
    {
        int[] arr1=new int[20];
        int s,i;
        /*putting the integer into the array*/
        for(i = 0; arr> 0; arr = arr/10,i++)
        {
            s =arr % 10;
            arr1[i]=s;
        }
        /*sorting the digits in non increasing order*/
        for(int k=0;k<i-1;k++)
        {
            for(int j=0;j<i-k-1;j++)
            {
                if(arr1[j]<arr1[j+1])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        for(int k=0;k<i;k++){
            System.out.print(arr1[k]); //printing the sorted string
        }

        System.out.println();
        int sum=0;
        for(int k=0;k<i;k++)
        {
            if(arr1[k]%2==0)            //summing the even numbers
                sum+=arr1[k];
        }
        return sum;
//        System.out.println("Sum of even numbers : "+ " "+sum);
//        if(sum>15) {                 /*If sum is greater than 15*/
//            System.out.println("True");
//        }
//        else {                      /*If sum is less than 15*/
//            System.out.println("False");
        }

    }

