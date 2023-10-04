package ExercisesAdvJava.Lesson_2.Ex_1;

public class Employee {
    public String fName = "John";
    public String lName = "Doe";

    public int id = 123;

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.fName + " " + emp.lName + " " + emp.id);
    }
}