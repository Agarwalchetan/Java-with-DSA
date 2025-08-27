package com.conditionals;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse A String In Java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to Reverse! : ");
        String str = sc.next();
        int length = str.length();
//        System.out.println(length);
        System.out.print("Reversed String : ");
        for (int i = 0 ; i < length ; i++){
            System.out.print(str.charAt(length-i-1));
        }
    }
}
