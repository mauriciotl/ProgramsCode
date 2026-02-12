package com.mau02.stackDeque.parenthesesCheck;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesChecker {

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

        //1. Creates a Deque (stack), ArrayDeque.
        Deque<Character> stack = new ArrayDeque<>();

        //2. Iterates over the parenthesis String converting it to charArray.
        for(char c : s.toCharArray()){

            // 2.1 push into the stack, if it's an open.
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);

                // 2.2. Enter into the else block, if it's a closer.
            } else if (c == ')' || c == ']' || c == '}') {

                // 2.2.1. If stack is empty return false, since it's an orphan open.
                if(stack.isEmpty()){
                    return false;
                }

                // 2.2.2 Retrieve the supposed open from the stack, which is a top right now.
                char top = stack.pop();

                // 2.2.3 Check if it's a match, if it's not a match return false.
                if(!isMatch(top, c)){
                    return false;
                }
            }//else if
        }//for

        // 3. If not empty (false) means there's an orphan parentheses, therefore it's a false.
        // It's a valid parenthesis otherwise = true.
        return stack.isEmpty();
    }

    /**
     * Helper method to check if an opener and closer pair match.
     */
    private static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }


}
