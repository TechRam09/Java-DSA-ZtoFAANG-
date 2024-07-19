package DSA;

public class Main {
    public static void main(String[] args) {

        //Q: Store a roll number
        int rollno = 38;

        //Q: Store a name
        String name = "Shree";

        //Q: Store 5 roll number
        int rno1 = 1;
        int rno2 = 22;
        int rno3 = 45;
        int rno4 = 38;
        int rno5 = 16;

        // it is difficult to store 100 roll number using the above way. so we use a data structure called array
        // array is homogenous collection of data items

        int[] rno = new int[5];
        // or directly by
        int[] rnos = {1,22,45,38,16};

        /*
        int[] rno // array declaration
        new int[5] creation of object
         */
        System.out.println(rnos[2]);// 45
        System.out.println(rno[2]);// default int array items value is 0

        //string array
        String[] arr = new String[5];
        System.out.println(arr[3]);// default String array items value is null

    }
}