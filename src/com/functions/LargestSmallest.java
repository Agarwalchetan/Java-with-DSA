package com.functions;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number
        //respectively among three numbers entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find the Maximum & Minimum Number!");
        System.out.print("Enter the Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Num3 : ");
        int num3 = sc.nextInt();
        int max = maximum(num1,num2,num3);
        int min = minimum(num1,num2,num3);
        System.out.println("Maximum  : " + max);
        System.out.println("Minimum  : " + min);

    }

    static int minimum(int a, int b, int c) {
        //Minimum
        if(a < b){
            if(a < c){
                return a;
            }
            return c;
        } else if (b < c) {
            return b;
        }
        return c;
    }

    static int maximum(int a, int b , int c){
        //Maximum
        if(a > b){
            if(a > c){
                return a;
            }
            return c;
        } else if (b>c) {
            return b;
        }
        return c;
    }
}
