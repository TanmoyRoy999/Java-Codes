package org.example;

import java.util.Scanner;

public class PrimeNo {

    public static void primeNo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Integer.valueOf(sc.nextLine());

        if(num<=1) {
            System.out.println("Not prime..");
            System.exit(0);
        }

        if (num%2==0) {
            System.out.println("Prime..");
            System.exit(0);
        }

        boolean isPrime=true;

        for (int i=2;i<Math.sqrt(num);i++){
            if(num%i==0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("is prime..");
        else
            System.out.println("not prime..");



    }

}
