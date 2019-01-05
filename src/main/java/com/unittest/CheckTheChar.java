package com.unittest;

import static java.lang.Character.*;

public class CheckTheChar {
    public String charcheck(char ch) {

//checking for uppercase
            if( isUpperCase(ch))
                return "Capital letter";
//checking for lowercase
            else if( isLowerCase(ch))
                return "Small letter";
//checking for digit
            else if( isDigit(ch))
                return "Digit";
            else
//Else print Special character
                return "Special character";
        }
    }

