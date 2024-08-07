package Patterns;

/*
for n = 4

1      1
12    21
123  321
12344321

 */

import java.util.Scanner;

public class NumberCrown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        numberCrown(n);
    }

    static void numberCrown(int n) {

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            } for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
