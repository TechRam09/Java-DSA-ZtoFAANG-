import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 2, 3};
        int[] result = moveZeroes(arr);
        System.out.println(Arrays.toString(result));
    }
    
    //brute force ,TC- o(2N)  , SP - > o(N)
    private static int[] moveZeroes(int[] a) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int element : a ) {
            if(element != 0){
                temp.add(element);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            a[i] = temp.get(i);
            int lastIndex = temp.size();
            for (int j = lastIndex; j < a.length; j++) {
                a[j] = 0;
            }
        }
        return a;
    }
}
