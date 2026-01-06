package com.mau02.map;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    public static void main(String[] args){

        String word = "interview";

        Map<Character, Integer> frequencyMap = charFrequency(word);

        System.out.println("Map char frequency: " + frequencyMap);

    }

    public static Map<Character, Integer> charFrequency(String s){

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }



}
