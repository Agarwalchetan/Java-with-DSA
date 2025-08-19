package com.agarwal;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int c = a + 2*(b+a);
        int count = 1;
        for(int i = 0; i <= c ; i++){
            System.out.println(count + " Hello World");
            count++;
        }
    }
}
