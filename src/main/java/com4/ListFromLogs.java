package com4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListFromLogs {

    /*
    --- The Oracle  ---
    Giving a list of logs, as the below one, create a list that retrieves a
    sub list regarding success messages order by user and date from the latest to the oldest.

    SUCCESS 2026-01-14 user01@maiL.com This was a read operation from the user
    ERROR 2026-01-15 user02@maiL.com This was an update operation from the user

     */


    public static void main(String[] args){


        System.out.println("The success list is: " + successList(pupulateList()));



    }


    private static Map<String, String> successList (List<String> loglist){

        Map<String, String> theSuccessList = new HashMap<>();

        for(String str : loglist){

            String[] rowRecord = str.split(" ");

            String status = rowRecord[0];
            String date = rowRecord[1];
            String user = rowRecord[2];
            String description = rowRecord[3];

            if(status.equals("SUCCESS")){

                if(theSuccessList.get(user) == null){
                    //add
                    theSuccessList.put(user, date);
                }else{
                    //update
                    theSuccessList.replace(user, date);
                }
            }
        }//for

        return theSuccessList;
    }


    private static ArrayList<String> pupulateList(){

        ArrayList<String> theList = new ArrayList<>();

        theList.add("SUCCESS 2026-01-14 user01@maiL.com This-is-a-read-operation");
        theList.add("ERROR 2026-01-15 user01@maiL.com This-is-a-update-operation");
        theList.add("SUCCESS 2026-01-16 user01@maiL.com This-is-a-delete-operation");
        theList.add("SUCCESS 2026-01-14 user02@maiL.com This-is-a-delete-operation");
        theList.add("ERROR 2026-01-15 user02@maiL.com This-is-a-read-operation");
        theList.add("SUCCESS 2026-01-16 user02@maiL.com This-is-a-update-operation");
        theList.add("SUCCESS 2026-01-14 user03@maiL.com This-is-a-update-operation");
        theList.add("ERROR 2026-01-15 user03@maiL.com This-is-a-read-operation");
        theList.add("SUCCESS 2026-01-16 user03@maiL.com This-is-a-delete-operation");
        theList.add("SUCCESS 2026-01-14 user04@maiL.com This-is-a-read-operation");

        return theList;
    }



}
