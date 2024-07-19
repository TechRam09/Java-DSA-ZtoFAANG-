package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = {1,2,3,4,5}; // first method direct
        // array of primitive
        int[] arr = new int[5];
        /*
        Second method: from arr[0] to arr[size-1]
        arr[0] = 1;
        arr[1] = 2;
        arr[3] = 3;
        arr[4] = 4;
         */

        //using for loop
        /*
        for less num of iteration (0-5)
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        */
        //for unknown num of iteration
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }


        //printing the entire array
      /*
        using for loop
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
        */
        //using for each loop
        for(int num : arr){
            System.out.print(num + " ");

        }
        System.out.println();
        // using Arrays class and toString() method best practice
        System.out.println(Arrays.toString(arr));

        // if we try to print arr[size] it shows an error
//        System.out.println(arr[5]);//error: array index out of bound

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }


}
