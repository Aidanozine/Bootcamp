package Book3.chapter6;

public class TestEquality2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aidan", "den Hoed");
        Employee emp2 = new Employee("Aidan", "den Hoed");
        if (emp1.equals(emp2)) { // Using @Override in employee class
            System.out.println("these employees are equal");
        } else {
            System.out.println("these employees are different");
        }
    }
}