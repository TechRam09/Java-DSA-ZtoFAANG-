package DSA;

import java.util.Scanner;

public class VowelsOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character to check: ");
        char ch = in.next().trim().charAt(0);
        switch (ch){
            case 'a','A','e' ,'E','i','I','o','O','u','U' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
