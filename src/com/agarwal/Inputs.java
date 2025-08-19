package com.agarwal;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        //For Strings
        //For Single Word
        String name = input.next();
        System.out.println(name);
        //For Single Line
        String line = input.nextLine();
        System.out.println(line);



    }
}
