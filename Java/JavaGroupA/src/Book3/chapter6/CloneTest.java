package Book3.chapter6;

public class CloneTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aidan", "den Hoed");
        Employee emp2 = (Employee) emp1.clone();
        System.out.println("emp1: " + emp1);
        System.out.println("emp2: " + emp2);
        if (emp1.equals(emp2)) {
            System.out.println("Cloning successful");
        } else {
            System.out.println("Cloning error");
        }
    }
}
