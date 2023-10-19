package ExercisesAdvJava.Lesson_5.Prac_2;

public class Main {
    public static void main(String[] args) {
        // Create employees
        Employee Tifa = new Employee("Tifa Lockheart", "Manager", "HR", 65000);
        Employee Aerith = new Employee("Aerith Gainsborough", "Staff", "HR", 55000);

        System.out.println("Tifa's witholding: " + Tifa.getWitholding());
        System.out.println("Aerith's bonus " + Aerith.getBonus());

//        BankEMICalculator acct1=new   BankEMICalculator("Tifa", "aa1234", 1000);
//        double EMIamt=acct1.getMonthlypayment();
//        System.out.print(EMIamt);
    }
}
