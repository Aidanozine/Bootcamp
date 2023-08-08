package Book3.chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {
    public Employee getEmployee() {
        return this;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter whether salary or hourly rate: ");
        String earningType = sc.nextLine();

        System.out.println("Enter your earning (e.g. 200,00) is: ");
        Double earning = sc.nextDouble();

        if (earningType.equals("salary")) {
            Employee emp = new SalariedEmployee(earning);
            ((SalariedEmployee) emp).getFormattedSalary();
        } else if (earningType.equals("hourly rate")) {
            Employee emp = new HourlyEmployee(earning);
            ((HourlyEmployee) emp).getFormattedRate();
        } else {
            System.out.println("Incorrect input");
        }
        }
    }

class SalariedEmployee extends Employee{
    double salary;

    public SalariedEmployee (double salary) {
        this.salary = salary;
    }
//    public String getFormattedSalary() {
//        NumberFormat sf = NumberFormat.getCurrencyInstance();
//        String msg = sf.format(this.salary);
//        return msg;
//    }
public void getFormattedSalary() {
    NumberFormat sf = NumberFormat.getCurrencyInstance();
    System.out.println("The employee's salary is " + sf.format(this.salary));
}
}

class HourlyEmployee extends Employee{
    double rate;

    public HourlyEmployee (double rate) {
        this.rate = rate;
    }

//    public String getFormattedRate() {
//        NumberFormat rf = NumberFormat.getCurrencyInstance();
//        String msg = rf.format(this.rate);
//        return msg;
//    }
public void getFormattedRate() {
    NumberFormat rf = NumberFormat.getCurrencyInstance();
    System.out.println("The employee's hourly rate is " + rf.format(this.rate));
}
}
