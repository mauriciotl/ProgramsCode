package com5;

import java.util.HashMap;
import java.util.Map;

public class SimpleClass {

    //The Confiz interview.

    /*Java Streams
Employee{
id:int
name:String
salary:BigDecimal
location:String
}


List<Employee> employees = getEmployees();

List<String> results = //write Java stream expression to get names of employees where salary  is Greater Than 70000

return Streams(employees e.salary -> e > 70000)

------


Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["flower","flow","inflow"]
Output: ""



*/


    public String commonPrefix(String[] stringArray){

        Map<Character, Integer> theMap = new HashMap<>();

        for(int i=0; i<stringArray.length; i++){

            String word = stringArray[0];

            for(int j = 0; j< word.length(); j++){

                char tempChar = word.charAt(j);

            }
        }
        return null;
    }
}
