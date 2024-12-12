package org.java.InterviewCodes;

import java.util.Scanner;

public class ReverseString {

    public static void reverseString() {

        String str = "Tanmoy";
        String reverseStr = "";

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            reverseStr = s + reverseStr;
        }

        System.out.println("reversed string: " + reverseStr);
    }

    public static void reverseString2() {

        String str = "Tanmoy";
        char[] charArr=str.toCharArray();
        int length= charArr.length;

        for (int i = 0; i < length / 2; i++) {
            char temp=charArr[i];
            charArr[i]=charArr[length-1-i];
            charArr[length-1-i]=temp;
        }

        String reverseStr=new String(charArr);
        System.out.println("reversed string: " + reverseStr);
    }

}
