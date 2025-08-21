package com.conditionals;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long num = sc.nextLong();
        System.out.print("Enter the Counting number : ");
        int n = sc.nextInt();
        long rem = 0;
        int count = 0;
        while(num > 0){
            rem = num % 10;
            if (rem == n){
                count++;
            }
            num /= 10;
        }
        System.out.println("Total Count is " + count);
    }
}
