package com.mau02.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNotEvenNumber {

    public static void main(String[] args){

        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        System.out.println(l.toString());
        System.out.println(remove(l));
        System.out.println("Remove using removeVJava8" + removeVJava8(l));

    }

    public static List<Integer> remove(List<Integer> theList){

        ArrayList<Integer> removed = new ArrayList<>();

        for(int i : theList){

            if(i % 2 == 0){
                removed.add(i);
            }
        }


        return removed;
    }

    public static List<Integer> removeVJava8(List<Integer> theList) {
        theList.removeIf(i -> i % 2 != 0);
        return theList;
    }


}
