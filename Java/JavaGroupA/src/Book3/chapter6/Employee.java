package Book3.chapter6;

public class Employee implements Cloneable{
    private String firstName;
    private String lastName;
    public Employee(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object emp) {
//        if (this == emp) {
//            return true;
//        }
        Employee e = (Employee)emp;
        return (this.firstName.equals(e.firstName)) && (this.lastName.equals(e.lastName));
    }

    @Override
//    public Object clone() {
//        Employee emp;
//        emp = new Employee(this.firstName, this.lastName);
//        return emp;
//    }

    public Object clone() {
        Employee emp;
        try {
            emp = (Employee)super.clone(); //shallow copy
        } catch (CloneNotSupportedException error) {
            return null;
        }
        return emp;
    }
}
