package com.agarwal;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        int num1 = input.nextInt();
        System.out.println(num);

        // type casting
        int num2 = (int)(67.56f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1

        byte j = 40;
        byte f = 50;
        byte c = 100;
        int d = a * b / c;

        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

        int number = 'A';
        System.out.println("你好");

        System.out.println(3 * 6);

        byte q = 42;
        char w = 'a';
        short s = 1024;
        int i = 50000;
        float e = 5.67f;
        double r = 0.1234;
        double result = (q * w) + (s / i) - (e * r);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
