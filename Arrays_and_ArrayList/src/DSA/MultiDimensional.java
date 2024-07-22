package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        // Syntax : dt[][] var_name = new dt[r_size][c_size];
        int[][] arr = new int[3][2];// row
        //direct initialisation
//        int[][] arr2D = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
/*
        individual array size can  be anything means column size can be anything
        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
*/
        //input
        Scanner in = new Scanner(System.in);
        for(int row =0; row<arr.length ; row++){
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        //using for loop
//        for(int row =0; row<arr.length ; row++){
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        //using Arrays.toString() to print individual row inside the outside array
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //using enhance for or for each loop using exter loop and print each element in it which each row
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
