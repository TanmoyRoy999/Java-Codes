package org.java.InterviewCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

    public static void duplicateCharsInStringUsingHashmapOrderN() {

        String str = "Tanmoyyoa";

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {            // O(n)
            char c = str.charAt(i);
            Integer count=countMap.get(c);
            if (count==null) {
                countMap.put(c, 1);     // amortized O(1)
            } else{
                countMap.put(c, count + 1);
            }
        }

        countMap.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
                .collect(Collectors.toList()).forEach(countMap::remove);

        System.out.println(countMap);

    }

}

