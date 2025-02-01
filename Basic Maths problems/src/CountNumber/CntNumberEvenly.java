package CountNumber;

import java.util.Scanner;

public class CntNumberEvenly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(evenlyDivides(n));
    }

    private static int evenlyDivides(int n) {
        int original = n;
        int count = 0;
        while(n > 0){
            int r = n % 10;
            if(r != 0 && (original % r) == 0){
                count++;
            }
            n /= 10;
        }

        return count;
    }
}
