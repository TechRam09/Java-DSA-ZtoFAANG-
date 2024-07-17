package DSA;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b= 20 ;
//        int a = 30; // a cannot be initialised  within same block scope but we can assign different value
       // System.out.println(temp);// temp can be only used in random function
//        System.out.println(num); // argument num can be used in random function
        //block scope
        {
//            int a = 23; // a cannot be initialised  within same parent block scope
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int num = 10;
        }
/*
        System.out.println(i); // i cannot be used bcz it is loop element
        System.out.println(num); // num cannot be used bvz num is declared inside loop scope
*/
    }

    static void random(int num){
        int temp =10;
//        System.out.println(a);  // a can be only accessed in main function
    }
}
