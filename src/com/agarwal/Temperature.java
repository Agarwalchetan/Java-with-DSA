package com.agarwal;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in C : ");
        double Cel = sc.nextDouble();
        double Far = (Cel * 1.8) + 32;
        System.out.println("Temp in F is " + Far);
    }
}
