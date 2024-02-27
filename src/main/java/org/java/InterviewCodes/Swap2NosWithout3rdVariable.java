package org.java.InterviewCodes;

import java.util.Scanner;

public class Swap2NosWithout3rdVariable {

    public static void swap2NosWithout3rdVariable(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        Integer num1= Integer.valueOf(sc.nextLine());
        System.out.print("Enter num2: ");
        Integer num2= Integer.valueOf(sc.nextLine());

        System.out.println();
        System.out.println("Before swap...");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println();
        System.out.println("After swap...");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

    }

}
