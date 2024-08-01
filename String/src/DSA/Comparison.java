package DSA;

public class Comparison {
    public static void main(String[] args) {
            String a = "Shree";
            String b = "Shree";
            String c = a;
        System.out.println(a == b);
//        System.out.println(c == a); //checks the value as well as the ref variable

        //create different objects
        String name1 = new String("Shree");
        String name2 = new String("Shree");
//        System.out.println(name1 == name2); //false

        //to check only values
        System.out.println(name1.equals(name2)); // true

        //print individual characters
        System.out.println(name1.charAt(0));
    }
}
