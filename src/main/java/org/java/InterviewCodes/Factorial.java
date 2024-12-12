package org.java.InterviewCodes;

import java.util.Scanner;

public class Factorial {

    public static void factorialUsingRecursion() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));

    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
