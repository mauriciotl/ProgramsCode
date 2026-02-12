package com.mau02.algorithms.binarySearch;

public class BinarySearch {


    public static void main(String[] args){


        int[] numberList = {1,2,3,4,5,6,7,8,9,10};

        int theValue = 2;

        System.out.println("The index value is: " + findIndexValueInArray(numberList, theValue));

        int theValue02 = 10;

        System.out.println("The index value02 is: " + findIndexValueInArray(numberList, theValue02));

    }



    private static int findIndexValueInArray(int[] arrayNumbers, int value) {

        int minIndex = 0;
        int maxIndex = arrayNumbers.length -1;
        int indexValue = (maxIndex - minIndex) / 2;

        do{

            if(arrayNumbers[indexValue] == value)
                return indexValue;

            if(arrayNumbers[indexValue] > value){
                //search in left side
                maxIndex = indexValue;

            }else {
                //seach in right side
                minIndex = indexValue;
            }

            indexValue = (maxIndex - minIndex)/2;

        }while (maxIndex <= arrayNumbers.length -1);


        return -1;
    }




}
