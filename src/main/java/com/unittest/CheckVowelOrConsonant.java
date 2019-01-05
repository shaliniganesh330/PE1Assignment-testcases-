package com.unittest;

import java.util.Scanner;

public class CheckVowelOrConsonant {
  String vowelorconsonant_1(String ch) {

      String string;
      string = ch.toLowerCase();
      for (int i = 0; i < string.length(); i++) {
          char ch1 = string.charAt(i);
          /*condition for checking whether a letter is vowel*/
          if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
//                System.out.println(ch + " " + "vowel");
              return "vowel";
          }
          /*condition for checking whether a letter is consonant*/
          else {
//
              return "consonant";
          }
      }
      return null;
  }
}
