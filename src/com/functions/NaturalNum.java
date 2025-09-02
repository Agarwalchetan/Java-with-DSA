package com.functions;

import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        //Write a function that returns the sum of first n natural numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find the sum of first n natural numbers");
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        sumNaturalFormula(n);
        sumNaturalLoops(n);
    }


    static void sumNaturalFormula(int a) {
        int sum = a * (a + 1) / 2;
        System.out.println("Total Sum (by Formula): " + sum);
    }

    static void sumNaturalLoops(int a){
        int sum = 0;
        for(int i = 1; i <= a ; i++){
            sum += i;
        }
        System.out.println("Total Sum (by Loops): " + sum);
    }
}
