/*
You are given a 3-digit number n, Find whether it is an Armstrong number or not.
An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371.

Note: Return "true" if it is an Armstrong number else return "false".
 */
package DSA;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any Three digits number: ");
        int num = in.nextInt();
        boolean ans = armstrong(num);
        System.out.println(ans);
    }

    static boolean armstrong(int num){
        int anum = 0;
        int n = num;
        while (n >0) {
            int r = n % 10;
            anum += r*r*r;
            n /=10;
        }
        return anum == num;
    }
}
