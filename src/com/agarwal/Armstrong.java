package com.agarwal;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Armstrong Number");
        System.out.print("Enter the Num : ");
        int num = sc.nextInt();

        int original = num;

        int digits = String.valueOf(num).length();

        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }


    }
}
