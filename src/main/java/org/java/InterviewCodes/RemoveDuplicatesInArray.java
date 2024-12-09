package org.java.InterviewCodes;

import java.util.*;
import java.util.function.Supplier;

public class RemoveDuplicatesInArray {
    public static void removeDuplicatesUsingSetOrderN() {

        int[] arr = {1, 4, 8, 4, 9, 5, 8, 5, 2, 4};

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }

    public static void removeDuplicatesUsingHashmapOrderN() {

        int[] arr = {1, 4, 8, 4, 9, 5, 8, 5, 2, 4};

        Map<Integer, String> hashMap = new HashMap<>();
        for (int i : arr) {
            hashMap.put(i, "Dummy value");
        }
        System.out.println(hashMap.keySet());
    }

    public static void removeDuplicatesUsingArraylistOrderN2() {

        int[] arr = {1, 4, 8, 4, 9, 5, 8, 5, 2, 4};

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!list.contains(i))
                list.add(i);
        }
        System.out.println(list);
    }

    public static void removeDuplicatesUsingFrequencyArrayOrderN() {

        // only possible in case of non negative integers in array
        // drawback: Huge space required coz size of frequency array will be the max element,
        // also many indexes will contain no value in frequency array
        int[] arr = {1, 4, 8, 4, 9, 5, 8, 5, 2, 4};

        int max = 0;
        for (int i : arr)
            max = Math.max(i, max);

        int[] frequencyArr = new int[max + 1];

        for (int i : arr)
            frequencyArr[i] += 1;

        for (int i = 0; i < frequencyArr.length; i++) {
            if (frequencyArr[i] > 0)
                System.out.print(i + " ");
        }
    }
}