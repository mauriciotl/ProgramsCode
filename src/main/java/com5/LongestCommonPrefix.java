package com5;


/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["flower","flow","inflow"]
Output: ""
 */


public class LongestCommonPrefix {



    public static void main(String[] args){


        String[] strs = {"flower","flow","flight"};

        System.out.println("The longest String is: " + getLongestCommonPrefix(strs));


    }




    public static String getLongestCommonPrefix(String[] words){

        //It stores the current char validation for each word in the words array
        char[] tempCharValidator = new char[words.length];

        //It stores the max number of times we need to iteract in a for,
        //dictated by the longest string.length in the words array
        int maxNumberOfIterations = longestStringLength(words);

        StringBuilder commonPrefix = new StringBuilder();

        //This is for the maxNumberOfIterations
        for(int i=0; i<maxNumberOfIterations; i++){

            //This is the lenght of the words array, because this
            //is the number of times we need to iterate.
            for(int j=0; j<words.length; j++){

                //Checking char at i location from word at j location from words
                char currentCharAt = words[j].charAt(i);

                tempCharValidator[j] = currentCharAt;
                //Ned to check the chars are the same in this previous char array

                if(isSameCharInCharArray(tempCharValidator))
                    //If so add it to the common prefixStringBuilder
                    commonPrefix.append(tempCharValidator[j]);

            }
        }
        return commonPrefix.toString();
    }



    private static int longestStringLength(String[] words){

        int maxLenght = 0;

        for(String s : words){

            if(s.length() > maxLenght)
                maxLenght = s.length();
        }

        return maxLenght;
    }


    private static boolean isSameCharInCharArray (char[] chars){


        int counter = chars.length;
        int i = 0;

       while (i < counter){

           if(chars[i] != chars[i++] ){
               return false;
           }
       }

       return true;
    }



}
