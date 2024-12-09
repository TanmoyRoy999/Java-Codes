package org.java.InterviewCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class CountHighestOccurenceOfElementInArray {
    public static void countHighestOccurenceUsingHashmapLambdaOrderN() {

        List<Integer> intList = new ArrayList<>(List.of(new Integer[]{2, 4, 7, 4, 7, 8, 9, 4}));
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

    public static void countHighestOccurenceUsingFrequencyArrayOrderN() {

        // only possible in case of non negative integers in array
        // drawback: Huge space required coz size of frequency array will be the max element,
        // also many indexes will contain no value in frequency array
        int[] arr = {2, 4, 7, 4, 7, 8, 9, 4};

        int max = 0;
        for (int i : arr)
            max = Math.max(i, max);

        int[] frequencyArr = new int[max + 1];

        for (int i : arr)
            frequencyArr[i] += 1;

        int maxValue=0;
        int maxCount=0;

        for (int i = 0; i < frequencyArr.length; i++) {
            int count=frequencyArr[i];
            if (count>0) {
                System.out.println("Occurence of " + i + " is " + count + " times");
                if (count>maxCount){
                    maxCount=count;
                    maxValue=i;
                }
            }
        }
        System.out.println(maxValue + " has the maximum occurrences " + maxCount+" times");
    }
}