package com.conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits!");
            case "Apple" -> System.out.println("A sweet red Fruit!");
            case "Orange" -> System.out.println("Round Fruit!");
            default -> System.out.println("Please Enter a vaild Fruit");
        }

    }
}
