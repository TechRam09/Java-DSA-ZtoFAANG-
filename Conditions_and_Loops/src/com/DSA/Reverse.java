package com.DSA;

public class Reverse {
    public static void main(String[] args) {
    int n = 1231;
    int original = n;
    int rev = 0;
    while(n>0){
        int rem = n % 10;
        rev = rev * 10 + rem;
        n /= 10;
    }
        System.out.println("The reversed number is :"+ rev);
        //Application:Palindrome
        if( rev == original){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
