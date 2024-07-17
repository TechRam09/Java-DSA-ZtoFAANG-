package DSA;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Shreeram");
        fun(7,8,9);
        sum(8,9);
        sum(5,6,7);
    }

    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
    static  void fun(int a , int b,int c){
        System.out.println("Third One");
        System.out.println("a:"+ a +" b:"+b+"c:"+c);
    }
    static  void sum(int a, int b){
        System.out.println("Fourth One");
        int sum = a+b;
        System.out.println(sum);
    }
    static  void sum(int a, int b, int c){
        System.out.println("Fifth one");
        int sum = a+b+c;
        System.out.println(sum);
    }
}
