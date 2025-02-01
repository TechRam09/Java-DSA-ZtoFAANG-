public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1};
        int n = 5;
        System.out.println(missingNumber(arr,n));
    }

    private static int missingNumber(int[] arr,int n) {
//        for (int i = 0; i < 5; i++) {
//            if(arr[i] != (i+1)){
//                return  i+1;
//            }
//        }
//        return -1;

        for (int i = 1; i <= n ; i++) {
            int flag = 0;
            for (int a: arr){
                if(a == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }
}
