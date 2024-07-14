package DSA;

import java.util.Scanner;

public class SUM  {
    public static void main(String[] args) {
      int ans = sum3(10,15); // function call
        System.out.println("The Sum is: " + ans);
    }

     static int sum3(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
    //function definition
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the num1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter the num 2:");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum = " + sum);
//    }
//    static int sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the num1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter the num 2:");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return  sum;
//    }


}
