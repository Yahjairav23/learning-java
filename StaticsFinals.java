class Student{

    // giving a variable a key word of final makes the variable a constant and it becomes unchangable
    // by convention, constant variables are names in all uppercase
    // the value must be assigned on the same line that it was created.
    public static final int MY_CONSTANT = 3;

    // non static variables are known as instance variables
    // each object gets it's own copy
    public String name;
    // static member variables, each object does not get their own copy
    // static variable are known as class variables
    public static String studentClass;

    // non static method
    // can access both non static and static variables
    public void studentName(){
        System.out.println(name);
    }

    // static method
    // static methods cannot access instance variables; they can only access class variables
    public static void className(){
        System.out.println("Java");
    }
}
public class StaticsFinals {
    public static void main(String[] args) {

        // to set static variables you call the static variable name on the class name
        Student.studentClass = "Java Fundamentals";
        System.out.println(Student.studentClass);

        // to call static methods, we call them on the class
        Student.className();

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Missy";
        student2.name = "Lory";

        System.out.println(student1.name);
        student2.studentName();
    }
}