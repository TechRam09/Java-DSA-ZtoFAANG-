package StarPatterns;

/*
    *
   ***
  *****
   ***
    *
 */

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        upperPyramid(n);
        lowerPyramid(n);
    }

    static void upperPyramid(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            } for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void lowerPyramid(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n ; j++) {
                System.out.print("*");
            } for (int j = i; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
