package com.Shreeram;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Roll Number:");
        int rollno = input.nextInt();
        System.out.println("The Roll No is " + rollno);
    }
}
