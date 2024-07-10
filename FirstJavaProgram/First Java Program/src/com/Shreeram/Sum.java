package com.Shreeram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.nextLine();
        System.out.println("The Size=" + str.length());
        System.out.println("Enter Two numbers to add");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is " + sum);
    }
}
