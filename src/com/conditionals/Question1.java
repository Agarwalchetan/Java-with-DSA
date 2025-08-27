package com.conditionals;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Write a program to print the sum of negative numbers,
        //sum of positive even numbers and the sum of positive
        //odd numbers from a list of numbers (N) entered by the user.
        //The list terminates when the user enters a zero.

        Scanner sc = new Scanner(System.in);
        System.out.println("To Calculate Enter the Numbers");

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        while(true){
            System.out.print("Enter num : ");
            int num = sc.nextInt();

            if(num == 0){
                break;
            }
            if(num < 0){
                sumNegative += num;
            }
            if(num > 0){
                if(num % 2 == 0){
                    sumPositiveEven += num;
                }else{
                    sumPositiveOdd += num;
                }
            }
        }
        System.out.println("Calculations!");
        System.out.println("Sum of Negative Numbers is " + sumNegative);
        System.out.println("Sum of Positive Even Numbers is " + sumPositiveEven);
        System.out.println("Sum of Positive Odd Numbers is " + sumPositiveOdd);
    }
}
