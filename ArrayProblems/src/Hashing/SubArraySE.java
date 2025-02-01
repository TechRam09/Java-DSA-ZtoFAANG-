package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySE {
    public static void main(String[] args) {
        int k = 5;
        int[] arr = {2,8,2,6,-6,3,2};
        ArrayList<Integer> list = subArray(arr,k);
        System.out.println(list);
    }

    static ArrayList<Integer> subArray(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
           int rem = sum - k;
           if(map.containsKey(rem)){
               int startIndex = map.get(rem) + 1;
               list.set(0,startIndex+1);
               list.add(i+1);
               break;
           }
           map.put(sum,i);
        }
        return list;
    }
}
