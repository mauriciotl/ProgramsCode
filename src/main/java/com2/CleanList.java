package com2;

import java.util.ArrayList;

public class CleanList {

    /*
    Oracle interview 5 January 2026, with Rodrigo.

    The team is enabling OCI at regional level, right now it's just working in India and USA.
    The testing has been a challenged, the team relly in other
    regions, and it's actually very difficult to test, what they've done is to test in other regions, but this
    would stop the operation there, so it's not very optimal.

    Technology, java, python few, grafana for monitoring, an own Terraform implementation
    a kind of own Terraform framework, a lot of linux.

    Oracle has its own AI Agent, still it needs to be feed.

    They're using code ranch for the code challenge, so I need to keep up practicing there.


     */


    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();

        list.add("car");
        list.add("doll#arm");
        list.add("ball");
        list.add("#train");

        System.out.println("The cleanlist: " + cleanList(list).toString());

    }


    private static ArrayList<String> cleanList(ArrayList<String> theList){

        ArrayList<String> cleanList = new ArrayList<>();

        for(String s: theList){

            if(!s.contains("#")){
                cleanList.add(s);
            }
        }

        return cleanList;

    }


}
