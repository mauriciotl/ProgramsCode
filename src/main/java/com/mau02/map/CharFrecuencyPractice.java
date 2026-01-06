package com.mau02.map;

import java.util.HashMap;
import java.util.Map;

public class CharFrecuencyPractice {


    public static void  main(String[] args){

        String word = "interview";

        System.out.println("Char frequency: " + coutFrecuency(word));


    }


    private static Map<Character, Integer> coutFrecuency(String s){

        Map<Character, Integer> frequency = new HashMap<>();

        for(char c : s.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c, 0) + 1 );
        }

        return frequency;

    }


}
