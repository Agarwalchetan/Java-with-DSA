package com.conditionals;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Reverse a Number");
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int rem = 0;
        System.out.print("Reverse number is ");
        while(num > 0){
            rem = num % 10;
            System.out.print(rem);
            num /= 10;
        }
    }
}
