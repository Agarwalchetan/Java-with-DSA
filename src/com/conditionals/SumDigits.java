package com.conditionals;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int dig = num % 10;
            sum += dig;
            num /= 10;
        }
        System.out.println("Sum : " + sum);
    }
}
