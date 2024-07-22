package DSA;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,5,22,66,99};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] a){
        int start = 0;
        int end = a.length-1;
        while (start< end){
            swap(a,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] a, int index1,int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
