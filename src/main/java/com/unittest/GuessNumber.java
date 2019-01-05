package com.unittest;
import java.util.Random;
import java.util.*;

public class GuessNumber {
    public String guess(int num) {
        /*Random class to generate a random number*/
        Random random = new Random();
        int rand_int;
        rand_int = random.nextInt(50);
//        return rand_int;
        /*checking for conditions*/
        if (num < rand_int && num > -1) {
            return "Number guessed is lesser";
        }
        if (num > rand_int) {
            return "Number guessed is greater";
        }
        if (num == rand_int) {
            return "Number guessed is correct";
        }
        return "null";
    }
}




















