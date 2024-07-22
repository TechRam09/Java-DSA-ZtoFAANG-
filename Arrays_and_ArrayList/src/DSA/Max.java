package DSA;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int max = maxValue(arr);
        System.out.println("The maxium value is: "+max);
    }

    static int maxValue(int[] a){
        if (a.length == 0){
            return -1;
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}
