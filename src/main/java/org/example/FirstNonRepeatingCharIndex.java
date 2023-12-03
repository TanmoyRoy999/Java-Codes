package org.example;

public class FirstNonRepeatingCharIndex {

    public static void firstNonRepeatingCharIndex() {

        /**
         *  Write a function that takes in a string of lower case English alphabet letters and returns
         *  the index of the string's first non-repeating character.
         *  (The first non-repeating character is the first character in the string that occurs only once).
         *
         *  If the input string does not have non repeating character, the function should return -1
         *
         *  Example:
         *  Input: abcdcaf
         *  Output: 1
         */

        String inputStr="aab";
        int index=-1;

        for (int i=0; i<inputStr.length();i++){

            boolean repeatFlag=false;
            char c=inputStr.charAt(i);

            for (int j=0;j<inputStr.length();j++){

                if (i==j)
                    continue;

                if (inputStr.charAt(j)==c){
                    repeatFlag=true;
                    break;
                }
            }
            if(!repeatFlag){
                index=i;
                break;
            }
        }

        System.out.println("Index is: "+index);
        System.out.println("First non-repeating char is: "+inputStr.charAt(index));

    }
}

