package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        //Input
//        list.add(24);
//        list.add(54);
//        list.add(64);
//        list.add(84);
//        list.add(94);
//
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        System.out.println(list.contains(64));

        //input from keyboard
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

        //to get element at particular index
        System.out.println(list.get(3));//pass index , here list[index] does not work

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
