package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxSubarraySum {

    public static void maxSubarraySumOrderN3() {

        int[] arr = {1, -4, -2, 5, 8, -5};

        long maxSum = Long.MIN_VALUE;
        String indices = "";

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                long currentSum = 0;
                int k = i;
                while (k <= j) {
                    currentSum += arr[k];
                    k++;
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    indices = i + "," + j;
                }
            }

        }

        String[] charArray = indices.split(",");

        for (int i = Integer.valueOf(charArray[0]); i <= Integer.valueOf(charArray[1]); i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sum is: " + maxSum);
    }

    public static void maxSubarraySumOrderN2() {

        int[] arr = {1, -4, -2, 5, 8, -5, 10};

        long maxSum = Long.MIN_VALUE;
        String indices = "";

        for (int i = 0; i < arr.length; i++) {
            long currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum+=arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    indices = i + "," + j;
                }
            }

        }

        String[] charArray = indices.split(",");

        for (int i = Integer.valueOf(charArray[0]); i <= Integer.valueOf(charArray[1]); i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sum is: " + maxSum);
    }

    public static void maxSubarraySumOrderN() {

        // Kanade's Algo

        int[] arr = {-1, -4, 2, 5, -1, -3, 8, -5};

        Long maxSum=Long.MIN_VALUE;
        Long currentSum=0L;

        int startIndex=-1;
        int endIndex=-1;

        for (int i=0;i< arr.length;i++){

            if(currentSum==0L)
                startIndex=i;

            currentSum+=arr[i];

            if (currentSum>maxSum){
                maxSum=currentSum;
                endIndex=i;
            }

            if (currentSum<0){
                currentSum=0L;
            }
        }

        System.out.println("Max sum is: "+maxSum);
        System.out.print("Resultant sub array is: ");

        for (int i=startIndex;i<=endIndex;i++)
            System.out.print(arr[i]+" ");

    }
}

