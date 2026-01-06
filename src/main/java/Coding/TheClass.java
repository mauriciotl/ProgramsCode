package Coding;

import java.util.ArrayList;

public class TheClass {

     //Exam from Cognizant.

    //"Given a string s, find the length of the longest substring without repeating characters."

    //Mauricio

    // Write a JavaScript function that takes a string as an argument and returns the character that appears most frequently in the string.


    public static void main(String[] args){

        findlength("Apple");

        System.out.println("The length is: " + findlength("Apple"));
    }


    public static int findlength(String string){

        char[] stringChar = string.toCharArray();

        ArrayList<Character> theLenght = new ArrayList<>();
        String newString;

        for(int i=0; i<stringChar.length; i++){

            if(theLenght.contains(stringChar[i])){

                //Exit
                break;
            }else {
                theLenght.add(stringChar[i]);
            }

        }

        return theLenght.size();
    }





}
