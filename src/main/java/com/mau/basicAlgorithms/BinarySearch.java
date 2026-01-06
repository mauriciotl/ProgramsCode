package com.mau.basicAlgorithms;

public class BinarySearch {



    public static void main(String[] args) {


        int[] anySortedArray = {2,7,9,12,15,21,30};
        int value = 7;

        System.out.println("The index of the looking for value is: "
                + binarySearch(anySortedArray,value));

        value = 2;

        System.out.println("The index of the looking for value is: "
                + binarySearch(anySortedArray,value));

        value = 21;

        System.out.println("The index of the looking for value is: "
                + binarySearch(anySortedArray,value));

        value = 30;

        System.out.println("The index of the looking for value is: "
                + binarySearch(anySortedArray,value));

        value = 69;
        System.out.println("The index of the looking for value is: "
                + binarySearch(anySortedArray,value));

    }


    public static int binarySearch(int[] sortedArray, int value) {


        int theIndex = -1;

        //JUST NEED TO HANDLE IT THE VALUE IS GREATER THAN MAX OR LESS
        //THAN MIn, then the value is not in the array

       int max = sortedArray.length;;
       int midle = (max/2);

        while (midle >= 0) {

            //Value has been found
            if(value == sortedArray[midle]){
                theIndex = midle;
                break;
            }

            //Move to the left
            if(value < sortedArray[midle]){
                max = midle;
                midle = (max/2);
            }
            //Move to the right
            else{
                midle = ((max-midle)/2)+midle;
            }




        }//end while


        return theIndex;
    }



}
