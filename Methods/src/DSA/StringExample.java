package DSA;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//    String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

     static String myGreet(String name) {
        String message;
         message = "Hello " + name;
         return message;
    }

//    static String greet(){
//        String greetMsg;
//        greetMsg = "Hi How are you";
//        return greetMsg;
//    }
}
