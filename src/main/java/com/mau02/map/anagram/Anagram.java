package com.mau02.map.anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {


    public static void main(String[] args){

        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Is anagram: " + isAnagram(s1,s2));



        String s3 = "triangle";
        String s4 = "integral";
        System.out.println("Is anagram: " + isAnagram(s3,s4));

        String s5 = "apple";
        String s6 = "pale";
        System.out.println("Is anagram: " + isAnagram(s5,s6));

        String s7 = "";
        String s8 = "";
        System.out.println("Is anagram: " + isAnagram(s7,s8));


    }



    private static boolean isAnagram(String s1, String s2){

        //1. Quick length check
        if(s1.length() != s2.length())
            return false;

        //2. Create a Map of the s1 String, this is a frequency map
        Map<Character, Integer> s1FrequencyMap = stringToFrequencyMapV02(s1);

        //3. Iterate over the s2 String.
        for(Character c : s2.toCharArray()){

            //3.1. Quick check if that char form the s2 String is contained in the s1FrequencyMap
            if(!s1FrequencyMap.containsKey(c))
                return false;

            //3.2. Discount that s2 char from the s1FrequencyMap by overwriting same char in the key
            // and discounting that char from the value.
            s1FrequencyMap.put(c, s1FrequencyMap.get(c) -1);

            //3.3. If the count is less than zero we have a different count
            if(s1FrequencyMap.get(c) < 0)
                return false;

        }//for

        return true;
    }


    private static Map<Character, Integer> stringToFrequencyMap(String s){

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(Character c : s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) +1);
        }

        return frequencyMap;
    }



    private static Map<Character, Integer> stringToFrequencyMapV02(String s){

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(Character c : s.toCharArray()){

            //Just for the first time
            if(!frequencyMap.containsKey(c))
                frequencyMap.put(c,1);

            //Second or more times
            frequencyMap.put(c, frequencyMap.get(c) + 1);

        }

        return frequencyMap;
    }





}
