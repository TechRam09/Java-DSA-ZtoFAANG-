package DSA;
public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 68.78734f;
        //printf is also used to print the output it is most often used in competitive programming
        //here % -is format specifier, .2 - means print 2 numbers after decimal, f - float value
        //it printf also round-off the number
//        System.out.printf("num: %.2f",num);// num: 68.79, 734 is removed and 8 is round-off to 9

        //we can use it for round-off the pi value
        System.out.println(Math.PI);// 3.141592653589793
        System.out.printf("Pi: %.3f",Math.PI);//Pi: 3.142

        // FORMAT SPECIFIER - String we use %s
        System.out.printf("\nMy name is %s and I'm a %s","shree","Coder");
    }
}
