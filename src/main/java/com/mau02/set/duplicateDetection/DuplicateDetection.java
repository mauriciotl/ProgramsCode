package com.mau02.set.duplicateDetection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDetection {

    public static void main (String[] args){

        int[] duplicateArray = {1,2,3,4,5,6};

        System.out.println("Contains duplicates: " + containsDuplicate(duplicateArray));
    }

    public static boolean containsDuplicate(int[] nums){

        //1. Create a Set collection: HashSet. TreeSet keeps the order.
        // NOTE. A Set doesn't allow duplicates.
        Set<Integer> notRepeatedSet = new HashSet<>();

        //2. Iterates over the Array: Integer, Char, String, or any other object.
        for(int n : nums){

            //2.1. Operation add over the Set returns true, if no previous same element on the Set, and adds it to the Set.
            // NOTE. It will return false if it finds a duplicate, and will not add this element to the list.
           // The following reads: IF NOT TRUE = IF FALSE, return true: this is a duplicate.
            if(!notRepeatedSet.add(n))
                return true;
        }

        //3. It has not find duplicates, therefore it doesn't contain duplicates.
        return false;
    }


}
