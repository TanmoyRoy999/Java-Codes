package org.example;

import java.util.Scanner;

public class ReverseString {

    public static void reverseString(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=sc.nextLine();
////        System.out.println("Enter another string: ");
////        String str2=sc.nextLine();
//
//        char[] charArray=str.toCharArray();
//        int length=charArray.length;
//        char[] charArray2=new char[length];
        String reverseStr="";
//
//        for (int i=0;i< length;i++){
//            charArray2[length-1-i]=charArray[i];
////            reverseStr=charArray[i]+reverseStr;
//        }
//
        for (int i=0;i<str.length();i++){
            char s=str.charAt(i);
            reverseStr=s+reverseStr;
        }
//
////        for (int i=str.length()-1;i>=0;i--){
////            char s=str.charAt(i);
////            reverseStr+=s;
////        }
//
//        reverseStr=String.valueOf(charArray2);
//        String str1=new String(charArray2);
//
        System.out.println("reversed string: "+reverseStr);

//        if(str2.equals(reverseStr))
//            System.out.println("Yes, palindrome");
//        else
//            System.out.println("Not a palindrome");

    }

}
