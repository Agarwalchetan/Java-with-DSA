package com.agarwal;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter Operator (+,-,*,/) : ");
        String operator = sc.next();
        if(operator.equals("+")){
            double sum = num1 + num2;
            System.out.println("Sum : " + sum);
        }
        else if(operator.equals("-")){
            double sub = num1 - num2;
            System.out.println("Difference : " + sub);
        }
        else if(operator.equals("*")){
            double product = num1 * num2;
            System.out.println("Product : " + product);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                double div = num1 / num2;
                System.out.println("Quotient : " + div);
            } else {
                System.out.println("Error: Division by zero!");
            }
        }
        else{
            System.out.println("Invalid Operator!");
        }
    }
}
