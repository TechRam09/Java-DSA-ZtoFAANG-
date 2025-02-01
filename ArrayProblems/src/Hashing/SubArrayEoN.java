package Hashing;

import java.util.HashSet;

public class SubArrayEoN {
    public static void main(String[] args) {
    int k = 5;
    int[] arr = {2,8,2,6,-6,3,2};
    boolean found = subArray(arr,k);
    }

    static boolean subArray(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        int sum =0;
        set.add(0);
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            int rem = sum -k;
            if(set.contains(rem)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
