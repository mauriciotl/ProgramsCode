package com.mau02.array.twoDimmensions;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class PairNumbers {

    public static void main(String[] args) {

        List<Integer> list01 = Arrays.asList(1, 2, 3);
        List<Integer> list02 = Arrays.asList(4, 5);

        int rows = list01.size() * list02.size();
        int columns = list02.size();

        Integer[][] matrix = new Integer[rows][columns];
        int k = 0;


        for (int n = 0; n < list01.size(); n++) {

            int m = 0;

            while (m < list02.size()) {

                if (m == 0) {
                    matrix[k][m] = list01.get(n);
                } else {
                    matrix[k][m] = list02.get(m - 1);
                }

                m++;
            }//while

            m = 0;
            k++;

            while (m < list02.size()) {

                if (m == 0) {
                    matrix[k][m] = list01.get(n);
                } else {
                    matrix[k][m] = list02.get(m);
                }

                m++;
            }//while

            k++;
        }//for

        System.out.println("The new list is: " + Arrays.deepToString(matrix));


    }//Ends main method.


}
