package DSA;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//195
        System.out.println("a" + "b");//ab
        System.out.println('a' + 3);//100
        System.out.println((char) ('a' + 3));//d , 100 is type casted to character which is the ascii value of d

        System.out.println("a" + 1);//a1 , 1 is converted to string using Integer.toString()

        System.out.println("Shree" + new ArrayList<>()); //Shree[] , ArrayList.toString()
        System.out.println("Shree" + new Integer(69)); //Shree69 , Integer.toString()
        //concatenated only string is present
//        System.out.println(new Integer(69) + new ArrayList<>()); // error , no string is present to concatenate
        System.out.println(new Integer(69) + "" + new ArrayList<>()); //69[] , at least empty string should be present

        //everything will be returned is toString()
    }
}
