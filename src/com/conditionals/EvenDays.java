package com.conditionals;

public class EvenDays {
    public static void main(String[] args) {
        //Question
        //Kunal is allowed to go out with his friends only on the even days of a given month.
        //Write a program to count the number of days he can go out in the month of August.

        int totalDays = 31;
        int countDays = 0;
        for(int i = 1; i <= totalDays; i++){
            if(i % 2 == 0){
                countDays++;
            }
        }
        System.out.println("Total Days he can go out is " + countDays);
    }
}
