package Patterns;

import java.util.Scanner;

/*
6
5 6
4 5 6
3 4 5 6
2 3 4 5 6
1 2 3 4 5 6
 */
public class Triangle3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        triangleThree(n);
    }
    static void triangleThree(int n){
        for (int i =n ; i >= 1 ; i--) {
            for (int j = i; j <=n  ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
