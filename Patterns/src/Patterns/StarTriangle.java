package Patterns;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        starTriangle(n);
        
    }
    static void starTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
