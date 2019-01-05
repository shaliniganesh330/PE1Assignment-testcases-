package com.unittest;

//package com.company;

//import java.util.Scanner;

public class ReverseTheString {
    public String reverse(String string){
        String string1= "";
        int length =string.length();
        /*loop for printing the string*/
        for(int i= length-1 ; i >= 0; i--)
            string1= string1 + string.charAt(i);
            return string1;
            }
}

