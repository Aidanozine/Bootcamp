package ExercisesAdvJava.Lesson_2.Ex_1;

import org.w3c.dom.ls.LSOutput;

public class CreatingJavaClasses {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1.fName + " " + emp1.lName + " " + emp1.id);
    }
}

class Employee{
    public String fName = "John";
    public String lName = "Doe";

    public int id = 123;
}