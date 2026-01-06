package com.mau.test;

public class FindWord {


    public static void main(String []args){

//        findwordNumber("baloonballoonbalon", "baloon");

        System.out.println("The result" + findwordNumber("baloonballoonbalon", "baloon"));

    }

    private static int findwordNumber(String longString, String fixedWord){

        System.out.println("Testing the method");
        //String baloonballoonbalon, find the string baloon, return the number of occurance
        //Baloon

        char[] charFixed = fixedWord.toCharArray();
        char[] charslongString = longString.toCharArray();
        int counter = 0;
        int newJ = 0;

        for(int i=0;i<longString.length();i++){

           for(int j=0;j<fixedWord.length(); j++){
               if(charslongString[j] == charFixed[j]){
                   //Continue with next

               }else{
                   break;
               }

           }

           counter++;
//           j = newJ;



        }
        return counter;
    }

}
