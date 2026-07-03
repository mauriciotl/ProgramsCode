package com.mau02.array.reverse;

import java.util.Arrays;

public class ReverseArray {

    /**
     * NOTE. Reverse array can be applied to palindrome with
     * minor/light adjustments.
     */

    public static void main (String[] args){

        String phrase = "The array";

        System.out.println("The reverse array by doReverse() method: " + Arrays.toString(doReverse(phrase.toCharArray())));

        System.out.println("The reverse array by reverse() method: " + Arrays.toString(reverse(phrase.toCharArray())));

        // The following is a different thing, it's an Array.sort practice

        char[] charArray = phrase.toCharArray();
        Arrays.sort(charArray);
        System.out.println("The sorted char array is: " + Arrays.toString(charArray));

        int[] intArray = {5,2,8,3,7,4,1};
        Arrays.sort(intArray);
        System.out.println("The sorted int array is: " + Arrays.toString(intArray));

    }

    public static char[] doReverse(char[] chars){

        char[] reverse = new char[chars.length];
        int index = chars.length -1;

        for(char c : chars){
            reverse[index--] = c;
        }

        return reverse;
    }


    public static char[] reverse(char[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char tmp = arr[left];

            arr[left] = arr[right];
            arr[right] = tmp;

            left++;
            right--;
        }

        return arr;
    }


}

