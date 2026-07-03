package com.mau02.map.charFrequency;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyPractice02 {



    public static void main(String[] args){

//        String word = "interview";
        String word = "Apple";

        System.out.println("Char frequency: " + frequencyMap(word));
    }

    public static Map<Character, Integer> frequencyMap (String s){

        Map<Character, Integer> map = new HashMap<>();

        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }


        return map;
    }


}
