package StarPatterns;

/*
* * *
* *
*


 */

import java.util.Scanner;

public class DecreasingTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        decreasingTriangle(n);
    }
    
    static void decreasingTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
