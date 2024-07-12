package com.DSA;

import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
/*
      method 1: by consider anyone input as max
        int max = a;
        if(b> max){
            max = b;
        }
        if(c>max){
            max = c;
        }
*/
        /*
 method w: by considering max as 0
        int max =0;
        if( a > b){
            max = a;
        }else {
            max = b;
        }
        if(c > max){
            max = c;
        }
*/

        // method three using Math.max function

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
