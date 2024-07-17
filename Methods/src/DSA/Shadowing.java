package DSA;

public class Shadowing {
    static int x =90;// this is class variable
    public static void main(String[] args) {
        System.out.println(x);// 90
        int x;
//        System.out.println(x); error because this will be the local variable 'x' which is local variable
        x =40;
        System.out.println(x);//40 -> value of local variable x
        fun();
    }

    static void fun(){
        System.out.println(x);//40 -> local variable value of x cannot be used in this scope so the value will be the value of class variable 'x'
    }
}
