package Book3.chapter6;

public class CloneTest2 {

    public static void main(String[] args) {
        Employee3 emp1 = new Employee3("Martinez", "Anthony");
        emp1.setSalary(40000.0);

        emp1.address = new Address("1 First Street", "Fresno", "CA", "93702");
        Employee3 emp2 = (Employee3) emp1.clone();

        System.out.println("**** after cloning ****\n");

        printEmployee(emp1);
        printEmployee(emp2);

        emp2.setLastName("Smith");
        emp2.address = new Address("2 Second Street","Fresno", "CA", "93722");

        System.out.println("**** after changing emp2 ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
        System.out.println(emp1.getClass().getName());
        System.out.println(emp2.getClass().getName());
    }

    private static void printEmployee(Employee3 e) {
        System.out.println(e.getFirstName()
                + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
}


class Employee3 implements Cloneable {
    private String lastName;
    private String firstName;
    private Double salary;
    public Address address;

    public Employee3(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Object clone() {
        Employee3 emp;
        try {
            emp = (Employee3) super.clone();
            emp.address = (Address) address.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp;
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}

class Address implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Address(String street, String city,
                   String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
    }

    public String getAddress() {
        return this.street + "\n"
                + this.city + ", "
                + this.state + " "
                + this.zipCode;
    }

}