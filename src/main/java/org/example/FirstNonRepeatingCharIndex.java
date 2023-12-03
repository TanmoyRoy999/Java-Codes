package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharIndex {

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

    public static void firstNonRepeatingCharIndexOrderN2() {

        String inputStr="aab";
        int index=-1;

        for (int i=0; i<inputStr.length();i++){       // O(n)

            boolean repeatFlag=false;
            char c=inputStr.charAt(i);

            for (int j=0;j<inputStr.length();j++){      // O(n)

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

    public static void firstNonRepeatingCharIndexOrderNLogN() {

        String inputStr="abcdd";

        Map<Character, Integer> countMap=new LinkedHashMap<>();

        for (int i=0;i<inputStr.length();i++){       // O(n)

            char c=inputStr.charAt(i);

            if (countMap.containsKey(c))
                countMap.put(c, countMap.get(c)+1);        // O(logn)
            else
                countMap.put(c,1);
        }

        Character firstNonRepeatChar=null;
        int index=-1;

        for (Map.Entry<Character, Integer> entry: countMap.entrySet()){

            if (entry.getValue()==1){
                firstNonRepeatChar=entry.getKey();
                index=inputStr.indexOf(firstNonRepeatChar);
                break;
            }
        }

        System.out.println("Index is: "+index);
        System.out.println("First non-repeating char is: "+firstNonRepeatChar);

    }
}

