package com.mau02.list.removeNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNotEvenNumber_Practice {


    public static void main(String[] args){

        Integer[] theNumbers = {1,2,3,4,5,6,7};

        ArrayList<Integer> listNumbers = new ArrayList<>(Arrays.asList(theNumbers));

        System.out.println("The not even list: " + removeNotEven(listNumbers));
        System.out.println("The original list: " + listNumbers);

        System.out.println("The not even list V02: " + removeNotEven_V02(listNumbers));
        System.out.println("The original list: " + listNumbers);

    }


    public static ArrayList<Integer> removeNotEven(ArrayList<Integer> numbers){

        ArrayList<Integer> notEvenList = new ArrayList<>();

        for(Integer n : numbers){

            if(n%2 == 0)
                notEvenList.add(n);
        }

        return notEvenList;
    }


    public static ArrayList<Integer> removeNotEven_V02(ArrayList<Integer> numbers){

        numbers.removeIf(n -> n % 2 > 0);

        return numbers;
    }


}
