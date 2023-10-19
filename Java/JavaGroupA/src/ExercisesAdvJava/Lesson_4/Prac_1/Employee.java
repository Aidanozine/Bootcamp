package ExercisesAdvJava.Lesson_4.Prac_1;

import ExercisesAdvJava.Lesson_4.Prac_1.Business.EmployeeStockPlan;
import ExercisesAdvJava.Lesson_4.Prac_1.Data.*;
public class Employee {
    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Venti Monstadt", "012-34-5678", 120_345.27);

        Manager mgr = new Manager(207, "Zonghli Liyue", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Nahida Sumeru", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Ei Inazuma", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        // Test the EmployeeStockPlan class
        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(eng, esp);
        printEmployee(adm, esp);
        printEmployee(mgr, esp);
        printEmployee(dir, esp);

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName("Zonghli Liyue");
        mgr.raiseSalary(10_000.00);
        printEmployee(mgr, esp);
    }

    public static void printEmployee(EmployeeData emp) {
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public static void printEmployee(EmployeeData emp, EmployeeStockPlan esp) {
        printEmployee (emp);
        System.out.println("Stock Options:   " + esp.grantStock(emp));
    }
}
