package ExercisesAdvJava.Lesson_3;

import ExercisesAdvJava.Lesson_3.Data.*;

public class Employee {
    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Venti Monstadt", "012-34-5678", 120_345.27);

        Manager mgr = new Manager(207, "Zonghli Liyue", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Nahida Sumeru", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Ei Inazuma", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        eng.printEmployee();

        adm.printEmployee();
        mgr.printEmployee();
        dir.printEmployee();

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName("Zonghli Liyue");
        mgr.raiseSalary(10_000.00);
        mgr.printEmployee();
    }
}
