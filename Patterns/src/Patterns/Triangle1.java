package Patterns;

/*
1
2 1
3 2 1
4 3 2 1
 */

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    triangleOne(n);
    }
    static void triangleOne(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j =i ; j >=1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
