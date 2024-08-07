package StarPatterns;

/*

 *
 * *
 * * *
 * *
 *

 */

import java.util.Scanner;

public class RotatedTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        increasingTriangle(n);
        decreasingTriangle(n);
    }

    static void increasingTriangle(int n) {
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void decreasingTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
