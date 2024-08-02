package Patterns;

import java.util.Scanner;

public class Seeding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        seeding1(n) ;
    }

    static void  seeding1(int n){
        for (int i = n; i > 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
