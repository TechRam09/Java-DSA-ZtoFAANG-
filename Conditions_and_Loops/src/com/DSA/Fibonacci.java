package com.DSA;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
/*
        while(count <= n){
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
*/

        while(count <= n){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}
