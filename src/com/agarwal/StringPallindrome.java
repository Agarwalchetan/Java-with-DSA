package com.agarwal;

import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find String is Palindrome ? ");
        System.out.print("Enter the String : ");
        String inp = sc.next();

        boolean isPalindrome = true;

        int n = inp.length();

        for(int i = 0; i <= n/2 ; i++){
            // madam
            if(inp.charAt(i) != inp.charAt(n-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("String " + inp + " is Palindrome");
        }else{
            System.out.println("String " + inp + " is not a Palindrome");
        }
        
    }
}
