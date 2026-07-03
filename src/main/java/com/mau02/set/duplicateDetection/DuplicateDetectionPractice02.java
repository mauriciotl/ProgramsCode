package com.mau02.set.duplicateDetection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateDetectionPractice02 {

    public static void main (String[] args){

//        int[] duplicateArray = {6,1,2,3,4,5,6};
//        int[] duplicateArray = {6,1,2,3,4,5,6};
        int[] duplicateArray = {5,4,3,2,1,0,-1};

        System.out.println("Contains duplicates: " + containsDuplicatedValues(duplicateArray));

        System.out.println("Contains duplicates: " + containsDuplicatedValuesTree(duplicateArray));

    }

    public static boolean containsDuplicatedValues(int[] intArray){

        Set<Integer> notDuplicatedSet = new HashSet<>();

        for(int n : intArray){
            if(!notDuplicatedSet.add(n)){
                return true;
            }
        }

        System.out.println("The not duplicated set is: " + notDuplicatedSet);

        return false;
    }


    /**
     * The following is not duplicated and also the set is sorted, it's a TreeSet
     */
    public static boolean containsDuplicatedValuesTree(int[] intArray){

        Set<Integer> notDuplicatedTreeSet = new TreeSet<>();

        for(int n : intArray){
            if(!notDuplicatedTreeSet.add(n)){
                return true;
            }
        }

        System.out.println("The not duplicated notDuplicatedTreeSet is: " + notDuplicatedTreeSet);

        return false;
    }


}
