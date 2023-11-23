package org.example;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = Integer.valueOf(sc.nextLine());

        int secondLastNum=0;
        int lastNum=1;
        System.out.print(secondLastNum+" ");
        System.out.print(lastNum+" ");
        int sum;

        for(int i=3;i<=10;i++){
            sum=secondLastNum+lastNum;
            System.out.print(sum+" ");
            secondLastNum=lastNum;
            lastNum=sum;
        }

    }

}
