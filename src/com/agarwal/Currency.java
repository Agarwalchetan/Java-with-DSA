package com.agarwal;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Currency Converter : ");
        System.out.println("(a) INR -> USD");
        System.out.println("(b) USD -> INR");
        System.out.print("Select (a) or (b) : ");
        String opt = sc.next();
        if(opt.equals("a")){
            //"INR -> USD"
            System.out.println("You Selected INR -> USD");
            System.out.print("Enter Amount in INR : ");
            double inr = sc.nextDouble();
            double usd = inr / 87.0261; //asof 20/08/2025
            System.out.println("Amount in USD : $" + usd);
        } else if (opt.equals("b")) {
            //"USD -> INR"
            System.out.println("You Selected USD -> INR");
            System.out.print("Enter Amount in USD : ");
            double usd = sc.nextDouble();
            double inr = usd * 87.0261; //asof 20/08/2025
            System.out.println("Amount in INR : ₹" + inr);
        }else {
            System.out.println("Invalid Selection");
        }
    }
}
