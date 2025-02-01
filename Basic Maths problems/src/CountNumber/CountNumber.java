package CountNumber;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countNumbers(n));
    }

//    static int countNumbers(int n){
//        int count = 0;
//        while(n>0){
//            count++;
//            n/=10;
//        }
//        return count;
//    }

    static int countNumbers(int n){
        int count;
        count = (int) (Math.log10(n) + 1);
        return  count;
    }
}
