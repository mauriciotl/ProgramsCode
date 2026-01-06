package com.mau02.set.duplicateDetection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDetection {

    public static void main (String[] args){

        int[] duplicateArray = {1,2,3,4,5,6};

        System.out.println("Contains duplicates: " + containsDuplicate(duplicateArray));
    }

    public static boolean containsDuplicate(int[] nums){

        Set<Integer> notRepeatedSet = new HashSet<>();

        for(int n : nums){
            if(!notRepeatedSet.add(n))
                return true;
        }

        return false;
    }


}
