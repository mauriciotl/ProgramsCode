package com.mau02.array.reverse;

import java.util.Arrays;

public class ReverseArrayPractice {


    public static void main(String[] args){

        char[] charArray = {'M','a','u','r','i','c','i','o'};

        System.out.println("The reverse char array is: " + Arrays.toString(doReverse(charArray)));
        System.out.println("The original array is: " + Arrays.toString(charArray));

    }


    private static char[] doReverse(char[] theArray){

        char[] reversed = new char[theArray.length];

        int index = theArray.length -1;

        for(char c : theArray){

            reversed[index--] = c;
        }

        return reversed;
    }



}
