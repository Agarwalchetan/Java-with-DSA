package com.functions;

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Factorial!");
        System.out.print("Enter the Num : ");
        int num = sc.nextInt();   // keep as int for loop control
        System.out.println("Factorial : " + factorial(num));
        sc.close();
    }

    static BigInteger factorial(int a) {
        BigInteger fac = BigInteger.ONE;
        if (a == 0) {
            return BigInteger.ONE;
        }
        for (int i = 1; i <= a; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
}
