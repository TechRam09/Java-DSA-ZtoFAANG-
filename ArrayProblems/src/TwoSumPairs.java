import java.util.ArrayList;

public class TwoSumPairs {
    public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> pairs = getTwoSumPairs(arr);
        for(ArrayList<Integer> pair : pairs){
            System.out.println(pair);
        }
    }

    private static ArrayList<ArrayList<Integer>> getTwoSumPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == 0){
                    ArrayList<Integer> pairs = new ArrayList<>();
                    pairs.add(arr[i]);
                    pairs.add(arr[j]);
                    result.add(pairs);
                }
            }
        }

        return result;
    }
}
