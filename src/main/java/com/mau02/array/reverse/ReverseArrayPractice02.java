package com.mau02.array.reverse;

public class ReverseArrayPractice02 {





    public char[] reverse (char[] charArray){


        int left = 0;
        int right = charArray.length-1;

        while (left < right){

            char temp = charArray[left];

            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return charArray;
    }



}
