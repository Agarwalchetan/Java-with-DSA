package com.functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //Write a program to print the circumference and area of a circle
        //of radius entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Circumference and Area of Circle!");
        System.out.print("Enter the Radius : ");
        double radius = sc.nextInt();
        circumference(radius);
        area(radius);
    }

    static void circumference (double r){
        System.out.println("Circumference : " + 2*Math.PI*r);
    }

    static void area (double r) {
        System.out.println("Area : " + Math.PI*r*r);
    }
}
