package ExercisesAdvJava.Lesson_4.Prac_2.Data;

public class Engineer extends EmployeeData{
    public Engineer(int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
    }
    public void engineerMethod(){
        System.out.println("Method specific to Engineer class");
    }
}
