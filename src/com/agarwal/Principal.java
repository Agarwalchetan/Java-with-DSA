package com.agarwal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calculate SI Enter these Value : ");
        System.out.print("Enter Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate % : ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time : ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest : " + si);
    }
}
