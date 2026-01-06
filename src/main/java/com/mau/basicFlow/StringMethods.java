package com.mau.basicFlow;

public class StringMethods {



    public static void main(String[] args) {

        reverseString("Hello World");
    }


    private static void reverseString(final String str) {

        System.out.println(str);

        char[] chars = str.toCharArray();

        char[] reversed = new char[chars.length];
        int counter = 0;
        for(int i = chars.length - 1; i >= 0; i--) {
            reversed[counter++] = chars[i];
        }

        System.out.println();
        for(char c : reversed) {

            System.out.print(c);
        }

    }

}
