package com.mau.basicAlgorithms;

public class ArraySum {

    public static void main(String[] args) {

        int[][] array1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] array2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        printArray(arraySum(array1, array2));
    }
    

    public static int[][] arraySum(int[][] array01, int[][]array02) {

        //Validate both arrays, same dimension, etc.

        int rows = array01.length;
        int columns = rows > 0 && array01[0] != null ? array01[0].length : 0;

        int[][] sumArray = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sumArray[i][j] = array01[i][j] + array02[i][j];
            }
        }

        return sumArray;
    }


    public static void printArray(int[][] anyArray){

        for (int[] i : anyArray) {
            for (int j = 0; j < anyArray[0].length; j++) {
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
    }

}
