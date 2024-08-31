package DSA;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean odd = isEvenOrOdd(n);
    if(!odd){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }
    }

    static boolean isEvenOrOdd(int n){
        return (n&1) == 1;
    }
}
