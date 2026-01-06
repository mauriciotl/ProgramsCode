package com.mau02.stackDeque.parenthesesCheck;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesCheckerPractice {


    public static void main(String[] args){

        // Test cases
        String test1 = "{[()]}";   // Valid
        String test2 = "{[(])}";   // Invalid (wrong order)
        String test3 = "((()))";   // Valid
        String test4 = "[()";      // Invalid (missing closer)
        String test5 = "()]";      // Invalid (missing opener)

        String test6 = "()(";      // Invalid (missing closer)
        String test7 = "(";      // Invalid (missing closer)
        String test8 = ")";      // Invalid (missing opener)

        String test9 = "(())()";    //Valid

        System.out.println("Test 1: " + test1 + " -> " + isValidParentheses(test1));
        System.out.println("Test 2: " + test2 + " -> " + isValidParentheses(test2));
        System.out.println("Test 3: " + test3 + " -> " + isValidParentheses(test3));
        System.out.println("Test 4: " + test4 + " -> " + isValidParentheses(test4));
        System.out.println("Test 5: " + test5 + " -> " + isValidParentheses(test5));
        System.out.println();
        System.out.println("Test 6: " + test6 + " -> " + isValidParentheses(test6));
        System.out.println("Test 7: " + test7 + " -> " + isValidParentheses(test7));
        System.out.println("Test 8: " + test8 + " -> " + isValidParentheses(test8));
        System.out.println();
        System.out.println("Test 9: " + test9 + " -> " + isValidParentheses(test9));

    }


    public static boolean isValidParentheses(String s){

        //create map (key, value) -> open parentheses type, close one  [it's optional]
        //Optionally and more straightforward create a isMatchFunction


        //loop
            //check is open -> push into the stackdeck

            //else -> compare with latest in the deck
                // is not a match
                  //return false
        //End loop

        //return: check whether the deck is empty, if not, it means it's an orphan therefore a false;

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if(!isMatch(stack.pop(), c))
                    return false;
            }
        }

        return stack.isEmpty();
    }




    private static boolean isMatch(char opener, char closer){

        return (opener == '(' && closer ==')') ||
                (opener == '[' && closer ==']') ||
                (opener == '{' && closer =='}');
    }




}
