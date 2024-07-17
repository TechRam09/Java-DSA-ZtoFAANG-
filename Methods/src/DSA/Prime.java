package DSA;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }

    static boolean prime(int num){
        if( num <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return  true;
    }
}
