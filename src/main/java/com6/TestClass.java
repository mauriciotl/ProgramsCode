package com6;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args){


        ArrayList<Integer> theList = new ArrayList<>();

        theList.add(4);
        theList.add(1);
        theList.add(10);
        theList.add(8);
        System.out.println("The max number is: " + maxnumber(theList));
    }


    public static int maxnumber(List<Integer> listNumbers){

        int temp = 0;

        for(int i = 0 ; i < listNumbers.size() -1 ; i++){

            if(listNumbers.get(i) > temp){
                temp = listNumbers.get(i);
            }

        }


        return temp;
    }


}
