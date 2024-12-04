package org.java.InterviewCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class CountHighestOccurenceUsingHashmapLambda {
    public static void countHighestOccurenceUsingHashmapLambda() {

        List<Integer> intList = new ArrayList<>(List.of(new Integer[]{2,4, 7, 4, 7, 8, 9, 4}));
        System.out.println("Intlist: " + intList);

        Supplier<Map> supplier = () -> {

            Map<Integer, Integer> countMap = new HashMap<>();

            for (Integer i : intList) {                     // O(n)
                Integer count = countMap.get(i);
                if (count == null)
                    countMap.put(i, 1);
                else
                    countMap.put(i, count + 1);
            }
            return countMap;
        };

        Map<Integer, Integer> outputMap = supplier.get();

//        System.out.println(outputMap);

        for (Integer i : outputMap.keySet())
            System.out.println("Occurence of " + i + " is " + outputMap.get(i) + " times");

        int maxCountKey = 0;
        int maxCountVal = 0;

        for (Map.Entry<Integer, Integer> entry : outputMap.entrySet()) {          // O(n)
            Integer value = entry.getValue();
            if (value > maxCountVal) {
                maxCountVal = value;
                maxCountKey = entry.getKey();
            }
        }

        System.out.println("Key " + maxCountKey + " has the maximum occurrences " + maxCountVal);

       // Total time complexity = O(n+n)=O(2n)=O(n)
    }
}