package org.java.InterviewCodes;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacciUsingLoop() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = Integer.valueOf(sc.nextLine());

        int secondLastNum=0;
        int lastNum=1;
        System.out.print(secondLastNum+" ");
        System.out.print(lastNum+" ");
        int sum;

        for(int i=3;i<=size;i++){
            sum=secondLastNum+lastNum;
            System.out.print(sum+" ");
            secondLastNum=lastNum;
            lastNum=sum;
        }

    }

    public static void fibonacciUsingRecursion() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = Integer.valueOf(sc.nextLine());
        System.out.println("nth fibonacci number is "+getNthFibonacciNum(n));
    }

    static int getNthFibonacciNum(int n){
        if (n==1)
            return 0;
        if (n==2)
            return 1;

        return getNthFibonacciNum(n-1)+getNthFibonacciNum(n-2);
    }

}
