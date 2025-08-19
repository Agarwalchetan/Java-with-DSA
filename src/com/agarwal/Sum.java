package com.agarwal;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Num2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is " + sum);

    }
}
