package DSA;

import java.util.Scanner;

public class FindIthPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        System.out.print("Enter the position:");
        int i = in.nextInt();
        System.out.println(ithPosition(num,i));

    }

    private static int ithPosition(int num, int i) {
        int mask = 1<<(i-1);
        int ithBit = (num & mask) != 0 ? 1 : 0;
        return ithBit;
    }
}
