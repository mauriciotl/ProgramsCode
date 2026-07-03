package com.mau02.map.anagram;

import java.util.HashMap;
import java.util.Map;

public class AnagramPractice {


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





    public static boolean isAnagram(String s1, String s2){

        Map<Character, Integer> mapFrequencyS1 = toCharFrequency(s1);

        if(s1.length() != s2.length())
            return false;


        for(char c : s2.toCharArray()){

            if(!mapFrequencyS1.containsKey(c))
                return false;

            mapFrequencyS1.put(c, mapFrequencyS1.getOrDefault(c, 0) -1);

            if(mapFrequencyS1.get(c) < 0)
                return false;


        }


        return true;
    }



    private static Map<Character, Integer> toCharFrequency(String s){

        Map<Character, Integer> map = new HashMap<>();


        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        return map;
    }


}
