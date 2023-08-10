package Book3.chapter6;

public class TestToString {
    public static void main(String[] args) {
        Employee emp = new Employee("Aidan", "den Hoed");
        System.out.println(emp); //always invokes toString() for printing objects
    }
}
