package org.java.Collections;

import org.java.POJOs.Person;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayPractice {

    public static void arraySort() {

        int arr[] = {5, 7, 3, 11, 1, 4};
        System.out.println("Unsorted array: " + Arrays.toString(arr));

//        Arrays.sort(arr);
//        System.out.println("Ascending sorted array (using Arrays.sort): " + Arrays.toString(arr));
//
//        Object[] arr2 = Arrays.stream(arr).boxed().toArray();
//        Arrays.sort(arr2, Collections.reverseOrder());
//        System.out.println("Descending sorted array (using Arrays.sort): " + Arrays.toString(arr2));

        List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list);
        System.out.println("Ascending sorted list: "+list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("Descending sorted list: "+list);


    }
}