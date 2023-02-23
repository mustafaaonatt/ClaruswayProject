package week3;
// Homework: Create 2 methods one for get info and printInfo()
// Create  objects from different cons. and print the  object info(fields)
// while creating object use default value, parameterized cons. and assign the value after creating the object
public class ConstructorExample {
    //Fields/instance Variables
    String className;
    String subject;
    int roomNumber;
    String teacher;
    String grade;

    //Default constructor
    public ConstructorExample() {

    }



   // Other constructor
   // We have many constructor with the same name from the same class but their Signatures/parameters different
   // we call these OVERLOADING(as the same in the methods)
    public ConstructorExample(String className, String subject, int roomNumber, String teacher, String grade) {
        this.className = className;
        this.subject = subject;
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.grade = grade;
    }

    public ConstructorExample(String className, String grade) {
        this.className = className;
        this.grade = grade;
    }

    public ConstructorExample(String className, int roomNumber, String grade) {
        this.className = className;
        this.roomNumber = roomNumber;
        this.grade = grade;
    }

    public ConstructorExample(String className, String subject, int roomNumber) {
        this.className = className;
        this.subject = subject;
        this.grade = grade;
    }


    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("Crazy", "7th grede");
        System.out.println(constructorExample.className);
        System.out.println(constructorExample.teacher);
        System.out.println(constructorExample.grade);

    }
}
