package com.agarwal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calculate Fibonacci");
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;


        System.out.println("Fibonacci Series upto nth term : ");

        // Print first two terms
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for(int i = 3; i<=n ; i++){
            //next term
             int next = a + b;
             a = b;
             b = next;
            System.out.print(next + " ");

        }
    }
}
