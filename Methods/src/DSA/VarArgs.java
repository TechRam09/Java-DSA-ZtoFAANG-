package DSA;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,4,5,56,78,89,69);
//        multiple(1,2,"Shree","Ram","NS");
        demo(1,2,3,4,5,6);
        demo("Shree","Ram","NS");
//        demo(); -> error because of ambiguity
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static  void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
//if we want to pass mixed values
    static void multiple(int a,int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

}
