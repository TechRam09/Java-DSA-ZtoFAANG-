package com.DSA;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
//          int n =575585;
            int count = 0;
//        while (n > 0){
//            int r = n % 10;
//            if(r == 5){
//                count++;
//            }
//            n = n/10;
//        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.print("Enter the number to be checked: ");
        int n = in.nextInt();
        while(num>0){
            int rem = num % 10;
            if(rem == n){
                count++;
            }
            num = num / 10;

        }
        System.out.println(count);
    }
}
