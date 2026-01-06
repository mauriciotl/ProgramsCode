package com.mau02.array;

import java.util.Arrays;

public class SumEvenNumbers {

    public static void main(String[] args){

        int[] theNumbers = {1,2,3,4,5,6};

        System.out.println("The sum is: " + doTheSumJava7(theNumbers));
        System.out.println("The sum using doTheSumJava7_2, is: " + doTheSumJava7_2(theNumbers));
        System.out.println("The sum using doTheSumJava8, is: " + doTheSumJava8(theNumbers));

    }

    public static int doTheSumJava7(int[] numbers){

        int theSum = 0;

        for(int i=0; i<numbers.length; i++){

            if(numbers[i]%2 == 0){
                theSum += numbers[i];
            }
        }
        return theSum;
    }


    public static int doTheSumJava7_2(int[] numbers){

        int theSum = 0;

        for(int number : numbers){
            if(number % 2 == 0){
                theSum += number;
            }
        }
        return theSum;
    }


    public static int doTheSumJava8(int[] numbers){

        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
    }




}
