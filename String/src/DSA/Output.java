package DSA;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        //println calls valueOf() functions which in turn calls toString() method
        System.out.println(69);//69
        System.out.println("Shree");//Shree
//        System.out.println(new int[]{2,4,6,8}); //[I@e9e54c2
        //but in terms of array it prints the default representation so we use Arrays,toString()
        System.out.println(Arrays.toString(new int[]{2,4,6,8}));

        String name = null;
        System.out.println(name);// ? null : obj.toString() if any object is initialised

        //integer also have .toString() method but we have to use wrapper class
        Integer num = new Integer(69);
        System.out.println(num.toString());
    }
}
