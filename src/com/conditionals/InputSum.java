package com.conditionals;

import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Started! For Quit enter '0'");
        int sum = 0;
        while(sum >= 0){
            System.out.print("Enter num : ");
            int n = sc.nextInt();
            sum += n;
            if(n == 0){
                System.out.println("Exit Input!");
                break;
            }
        }
        System.out.println("Total Sum : " + sum);
    }
}
