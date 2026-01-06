package com.mau.basicAlgorithms;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args){


        int[] unsortedArray = {9,8,7,6};

        System.out.println(Arrays.toString(sortArrayAsc(unsortedArray)));


        int[] unsortedArrayII = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(sortArrayAsc(unsortedArrayII)));

        int[] unsortedArrayIII = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(sortArrayAsc(unsortedArrayIII)));

    }

    public static int[] sortArrayAsc(int[] xArray){

        for(int i=1; i <= xArray.length-1; i++){
            for(int j =0; j <= xArray.length -2; j++){
                if (xArray[j] > xArray[j+1]){
                    int temp = xArray[j];
                    xArray[j] = xArray[j+1];
                    xArray[j+1] = temp;
                }
            }
        }



        return xArray;
    }



}
