package Patterns;

/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
 */

import java.util.Scanner;

public class Triangle4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        triangleFour(n);
    }

     static void triangleFour(int n) {
         for (int i = 1 ; i <= n ; i++) {
             for (int j = n ; j >= i  ; j--) {
                 System.out.print(j + " ");
             }
             System.out.println();
         }
    }
}
