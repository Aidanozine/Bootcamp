package Book4.chapter5;

class Employee {
    String firstName;
    String lastName;
    public Employee(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}

class HourlyEmployee extends Employee{
    public HourlyEmployee(String lastName, String firstName) {
        super(lastName, firstName);
    }
}