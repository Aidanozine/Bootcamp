package ExercisesAdvJava.Lesson_4.Prac_2.Data;

public class Manager extends EmployeeData{
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment:      " + getDeptName();
    }
}
