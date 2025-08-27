package com.conditionals;

import java.util.Scanner;

public class InputMax {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Started! For Quit enter '0'");
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.print("Enter num : ");
            int n = sc.nextInt();
            max = Math.max(max,n);

            if(n == 0){
                System.out.println("Exit Input!");
                break;
            }
        }
        System.out.println("Large Num : " + max);
    }
}
