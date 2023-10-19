package ExercisesAdvJava.Lesson_2;

import ExercisesAdvJava.Lesson_2.EmployeeData.EmpData;
public class Employee extends EmpData {
    public static void main(String[] args) {
        Employee emp = new Employee ();
        emp.setEmpId(101);
        emp.setName("John Doe");
        emp.setSsn ("123-45-6789");
        emp.setSalary(15000.00);
        System.out.println ("Employee id:         " + emp.getEmpId());
        System.out.println ("Employee name:       " + emp.getName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " + emp.getSalary());
    }
}