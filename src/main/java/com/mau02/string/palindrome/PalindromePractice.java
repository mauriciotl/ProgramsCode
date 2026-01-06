package com.mau02.string.palindrome;

public class PalindromePractice {

    public static void main(String [] args){

        String s = "racecar";

        String s2 = "gato";

        System.out.println("Is palingrome? " + s +" :"+ isPalindrome(s2));

        System.out.println("Is isPalindromeByFunction? " + s +" :"+ isPalindrome(s2));

    }


    public static boolean isPalindrome(String s){

        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;


        while(left++ < right--){

            if(chars[left] != chars[right])
                return false;
        }

        return true;
    }



    public static boolean isPalindromeByFunction(String s){

        return new StringBuilder(s).reverse().toString().equals(s);
    }




}
