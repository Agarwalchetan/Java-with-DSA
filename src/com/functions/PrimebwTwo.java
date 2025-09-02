package com.functions;

import java.util.Scanner;

public class PrimebwTwo {
    public static void main(String[] args) {
        //Write a function that returns all prime numbers between two given numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find all Prime Numbers between two given Numbers");
        System.out.print("Enter the First Num : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Num : ");
        int num2 = sc.nextInt();
        if(num2 > num1){
            PrimebwTwoNumbers(num1,num2);
        }else{
            System.out.println("Second Num will be greater than First Num!");

        }

    }

    static void PrimebwTwoNumbers (int a, int b) {
        //Find Between
        for(int i = a ; i <= b ; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static  boolean isPrime (int n){
        if(n < 2){
            return false;
        }
        for(int j = 2 ; j*j <= n ; j++){
            if(n % j == 0){
                return false;
            }
        }
        return true;
    }
}
