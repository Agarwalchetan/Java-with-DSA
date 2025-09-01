package com.functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num to Check : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <= 1){
            System.out.println("1 can Neither be Prime nor Composite!");
        }

        for(int i = 2; i*i <= num ; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        //Print
        if(isPrime){
            System.out.println(num + " is Prime!");
        }else{
            System.out.println(num + " is not Prime!");
        }
    }
}
