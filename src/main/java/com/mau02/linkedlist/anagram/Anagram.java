package com.mau02.linkedlist.anagram;

import java.util.LinkedList;

public class Anagram {


    public static void main(String[] args){

        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("apple", "pale")); // false
        System.out.println(isAnagram("apple", "appli")); // false

        System.out.println("Using V02");

        System.out.println(isAnagramV02("listen", "silent")); // true
        System.out.println(isAnagramV02("triangle", "integral")); // true
        System.out.println(isAnagramV02("apple", "pale")); // false
        System.out.println(isAnagramV02("apple", "appli")); // false



    }

    private static boolean isAnagram(String s1, String s2){

        LinkedList<Character> charList01 = stringToLinkedList(s1);
        LinkedList<Character> charList02 = stringToLinkedList(s2);

        int count = 0;

        if (charList01.size() != charList02.size()) {
            return false;
        } else {

            for (Character c : charList01) {

                if (charList02.remove(c)) {
                    count++;
                } else {
                    return false;
                }

            }
        }//else

        return charList01.size() == count;
    }


    private static boolean isAnagramV02(String s1, String s2){

        LinkedList<Character> charList02 = stringToLinkedList(s2);

        int count = 0;

        if (s1.length() != charList02.size()) {
            return false;
        } else {

            for (Character c : s1.toCharArray()) {

                if (charList02.remove(c)) {
                    count++;
                } else {
                    return false;
                }

            }
        }//else

        return s1.length() == count;
    }



    private static LinkedList<Character> stringToLinkedList(String s){

        LinkedList<Character> theLinkedList = new LinkedList<>();

        for(char c: s.toCharArray()){
            theLinkedList.add(c);
        }

        return theLinkedList;
    }


}
