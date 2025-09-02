package com.functions;

import java.util.Scanner;

public class Tripet {
    public static void main(String[] args) {
        //Write a function to check if a given triplet is a Pythagorean triplet or not.
        //A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number.
        //And Show the Triplet in OutPut
        Scanner sc = new Scanner(System.in);
        System.out.println("To find Pythagorean Triplet!");
        System.out.print("Enter the num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the num2 : ");
        int b = sc.nextInt();
        System.out.print("Enter the num3 : ");
        int c = sc.nextInt();

        triplet(a,b,c);
    }

    static  void triplet (int num1 ,int num2 ,int num3) {
        if(num1*num1 + num2*num2 == num3*num3){
            System.out.println("Yes! They are Pythagoras Triplet");
            System.out.println(num1 + "^2 + "+ num2 + "^2 = " + num3 + "^2");
        } else if (num2*num2 + num3*num3 == num1*num1) {
            System.out.println("Yes! They are Pythagoras Triplet");
            System.out.println(num2 + "^2 + "+ num3 + "^2 = " + num1 + "^2");
        } else if (num3*num3 + num1*num1 == num2*num2) {
            System.out.println("Yes! They are Pythagoras Triplet");
            System.out.println(num3 + "^2 + "+ num1 + "^2 = " + num2 + "^2");
        }else{
            System.out.println("No! They are Not Pythagoras Triplet");
        }
    }
}
