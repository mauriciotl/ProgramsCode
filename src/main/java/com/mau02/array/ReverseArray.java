package com.mau02.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main (String[] args){

        String phrase = "The array";

        System.out.println("The reverse array: " + Arrays.toString(doReverse(phrase.toCharArray())));

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


    public static int[] reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }

        return arr;
    }


}

