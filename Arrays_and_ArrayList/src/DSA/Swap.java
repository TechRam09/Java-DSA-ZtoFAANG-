package DSA;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,5,22,66,99};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println("The Swapped Array: "+Arrays.toString(arr));
    }

    static void swap(int[] a,int index1,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
