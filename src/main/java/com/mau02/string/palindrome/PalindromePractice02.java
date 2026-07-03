package com.mau02.string.palindrome;

public class PalindromePractice02 {


    public static void main(String[] args){

        String thePhrase = "Anita lava la tina";

        System.out.println("Is the phrase - " + thePhrase + " - a palindrome? " + isPalindrome(thePhrase));

    }



    public static boolean isPalindrome(String phrase){

        //Remove spaces and to lower case
        phrase = phrase.replaceAll("\\s+","").toLowerCase();

        int left = 0;
        int right = phrase.length()-1;

        while(left < right){

            if(phrase.toCharArray()[left] != phrase.toCharArray()[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }//End method.
}
