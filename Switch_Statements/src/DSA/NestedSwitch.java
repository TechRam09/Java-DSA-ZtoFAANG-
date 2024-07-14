package DSA;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter EmpId: ");
        int id = in.nextInt();
        System.out.print("Enter the Department");
        String dept = in.next();
/*
        switch (id){
            case 1:
                System.out.println("Keerthi");
                break;
            case 2:
                System.out.println("Nishanth");
                break;
            case 3:
                System.out.println("Shreeram");
                switch (dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("No Department Entered");
                }
                break;
            default:
                System.out.println("Enter valid EmpId");
        }
*/
        //enhanced switch
        switch (id) {
            case 1 -> System.out.println("Keerthi");
            case 2 -> System.out.println("Nishanth");
            case 3 -> {
                System.out.println("Shreeram");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter valid EmpId");
        }
    }
}
