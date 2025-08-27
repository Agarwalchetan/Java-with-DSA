package com.conditionals;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).

        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Factors.");
        System.out.print("Enter The Num : ");
        int num = sc.nextInt();
        System.out.print("Factors are : ");

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
