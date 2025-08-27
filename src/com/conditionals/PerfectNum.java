package com.conditionals;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).

        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Perfect Number.");
        System.out.print("Enter The Num : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if (num == sum){
            System.out.println(num + " is the Perfect Number!");
        }else{
            System.out.println(num + " is not the Perfect Number!");
        }
    }
}
