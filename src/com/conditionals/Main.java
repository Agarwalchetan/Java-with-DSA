package com.conditionals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*
              Syntax of if statements :
              if (boolean expression T or F) {
                   // body
              } else if () {
                   // do this
              } else {
                   // do this
              }
        */

        int salary = 25400;
        if(salary > 10000){
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
