package com.agarwal;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find the largest number : ");
        System.out.print("Enter the num1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the num2 : ");
        double num2 = sc.nextDouble();
        if (num1 > num2){
            System.out.println("Largest no is " + num1 + " (num1)");
        }else {
            System.out.println("Largest no is " + num2 + " (num2)");
        }
    }
}
