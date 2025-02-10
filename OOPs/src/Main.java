/*
 Class is a blueprint of object where object is an instance of class and this keyword is used to
 refer the properties of current object called class and construct name should be same

 Constructor -  it is used to initialised object when it is created, it doesn't return anything so return type

 Three types of Constructor
 Default or zero parameter constructor
 Parameterized constructor
 copy constructor
*/


class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
/*
        Student s1 = new Student();/* here Student() is method which is class as constructor in terms of class, and it
        is a default constructor called during object creation
        * /
        s1.age = 20;
        s1.name = "Shreeram";
        s1.printInfo();

*/
        Student s2 = new Student("Rahul",21);
        s2.printInfo();
        Student s3 = new Student("Rl",25);
        s3.printInfo();
    }
}