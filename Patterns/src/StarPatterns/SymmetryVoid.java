package StarPatterns;
/*
for n = 3

 * * * * * *
 * *     * *
 *         *
 *         *
 * *     * *
 * * * * * *

 */
import java.util.Scanner;

public class SymmetryVoid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        upperPart(n);
        lowerPart(n);
    }

    private static void upperPart(int n) {
//        n=3;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void lowerPart(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
