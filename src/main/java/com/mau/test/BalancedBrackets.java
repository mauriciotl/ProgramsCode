package com.mau.test;
import java.util.HashMap;
import java.util.Stack;


    ////////////////////////////////////////////////////////////////////////////////////////////////
//                                    Balanced brackets
//
//  DESCRIPTION:
//
//  Given a string containing different types of brackets, verify if the brakets are balanced.
//  For example:
//
//  "{([[{}]])}" is balanced since all the brackets were opened and closed correctly.
//  "{()[](}" is not balanced since there is a missing close parethesis.
//  "{}[]()" is balanced. Notice the brackets don't need to be nested.
//  "" is balanced by definition.
//
//  Input: A string of backets. It can be an empty string.
//  Output: A bool value indicating if the string is balanced or not.
//
//  HINT: Use java.util.*.


    /**
     *
     * @author Toshiba GCS
     */
    public class BalancedBrackets {

        public static boolean balancedBrackets(String str){
            /* PLEASE ADD YOUR CODE HERE */


            // maps keys

            HashMap theLlavesMap = new HashMap<String, String>();

            theLlavesMap.put("{", "}");
            theLlavesMap.put("[", "]");
            theLlavesMap.put("(", ")");
            theLlavesMap.put("", "");

            // Converts input to char

            char[] theCharArray = str.toCharArray();

//            // Populate stack
//            Stack<Char> stack = new Stack<Char>();
//
//            // Compare
//
//
//
//
//            //






            return false;
        }

        public static void main(String[] args) {
            String[] tests = {
                    "{[(])}", "{[({[])]}", "()[]{}", "}", "[", "",
                    "([]){}", "([)]"
            };
            boolean expectedValues[] = {
                    false, false, true, false, false, true,
                    true, false
            };

            int ok=0;
            for (int i=0; i < tests.length; i++){
                boolean result = balancedBrackets(tests[i]);
                if (result == expectedValues[i]){
                    ok++;
                } else {
                    System.out.printf("Test %d failed: %s\n", i+1, tests[i]);
                }
            }

            System.out.printf("Passed %d of %d test cases\n", ok, tests.length);
        }

    }










