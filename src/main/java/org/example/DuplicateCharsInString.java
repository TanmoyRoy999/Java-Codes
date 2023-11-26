package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

    public static void duplicateCharsInString() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (countMap.containsKey(str.charAt(i))) {
                countMap.put(str.charAt(i), countMap.get(str.charAt(i)) + 1);
            } else {
                countMap.put(str.charAt(i), 1);
            }
        }

        countMap.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
                        .collect(Collectors.toList()).forEach(countMap::remove);

        System.out.println(countMap);

    }

}
