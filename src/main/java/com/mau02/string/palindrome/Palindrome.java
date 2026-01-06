package com.mau02.string.palindrome;

public class Palindrome {


    public static void main(String[] args){

        String theString = "anitalavalatina";

        System.out.println("Is palindrome: " + isPalindrome(theString));

        System.out.println("Is palindrome v2: " + isPalindromeV2(theString));
    }



    public static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length()-1;

        while(right > left){

            if(s.charAt(left++) != s.charAt(right--))
                return false;
        }

        return true;
    }


    public static boolean isPalindromeV2(String s){

        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }



}
