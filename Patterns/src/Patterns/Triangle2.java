package Patterns;

import java.util.Scanner;

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
 */
//for n input
public class Triangle2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        triangleTwo(n);
    }

    static void triangleTwo(int n){
        for (int i = n ; i >= 1 ; i--) {
            for (int j = n ; j >= i ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
