package com.mau02.set.duplicateDetection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateDetectionPractice {




    public static void main(String[] args){

        int[] theNumbers = {1,2,3,4,5,1};
        int[] theNumbers2 = {1,2,3,4,5};

        System.out.println("Contains duplicates: " + Arrays.toString(theNumbers) + " " + isDuplicated(theNumbers));
        System.out.println("Contains duplicates: " + Arrays.toString(theNumbers2) + " " + isDuplicated(theNumbers2));

    }


    private static boolean isDuplicated(int[] numbers){

        Set<Integer> setList = new HashSet<>();

        for(int number : numbers){

            //If be able to add it will return true, false otherwise and left it unchanged
            if(!setList.add(number))
                return true;
        }

        return false;
    }


    private static boolean isDuplicatedSoCool(int[] numbers){

        return DuplicateDetection.containsDuplicate(numbers);
    }




}
