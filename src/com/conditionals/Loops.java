package com.conditionals;

public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers from 1 to 5

        // For loop
        // When you know how many loops
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }

        // While loop
        // When you don't know how many loops
        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }

        // Do While loop
        // it executes atleast once
        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while(n <= 5);


    }
}
