import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rollnumbers = new int[5];

        //store 5 names
        String[] name = new String[5];

        //data of 5 students
        int[] rno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];


        //to combine all three datatype into single entity we use class
        Student[] students = new Student[5];

        //create a student
//        Student Shreeram;
//        Shreeram  = new Student();


        Student Shreeram = new Student();
//        System.out.println(Shreeram);
        System.out.println(Shreeram.rno);
        System.out.println(Shreeram.names);
//        System.out.println(Arrays.toString(students));
//        System.out.println(Shreeram);

    }
    //create class
    static class Student{
        int rno ;
        String names;
        float marks;

    }
}