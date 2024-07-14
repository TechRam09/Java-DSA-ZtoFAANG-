package DSA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
        System.out.print("Enter a fruit: ");
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A round fruit");
                break;
            case "Grapes":
                System.out.println("A small green fruits");
                break;
            default:
                System.out.println("Enter valid fruit");
        }

         enhanced Switch statement
                 switch (fruit) {
                     case "Mango" -> System.out.println("King of Fruits");
                     case "Apple" -> System.out.println("A sweet red fruit");
                     case "Orange" -> System.out.println("A round fruit");
                     case "Grapes" -> System.out.println("A small green fruits");
                     default -> System.out.println("Enter valid fruit");
                 }
       */
       // display day name b/w 1 & 7
        System.out.print("Enter day: ");
        int day = in.nextInt();
/*
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
*/

        // display weekdays for first 5 days and weekend for rest two days
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//        }
        // enhance switch
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}