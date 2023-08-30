package Book4.chapter3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest implements Iterable {
    public static void main(String[] args) {
//        ArrayList signs;
//        signs = new ArrayList();
//        signs.add(100);
//        signs.add("Hello World");
//        System.out.println(signs);

//        ArrayList<String> signs = new ArrayList<>();
////        signs.add(100); // can only accept strings
//        signs.add("Woohoo");
////        System.out.println(signs);
//        Employee emp;
//        emp = new Employee("Aidan", "den Hoed");
//        signs.add(emp.toString());
//        System.out.println(signs);

//        ArrayList<Employee> signs = new ArrayList<>();
////        signs.add("Woohoo"); // only accepts type employee
////        System.out.println(signs);
//        Employee emp;
//        emp = new Employee("Aidan", "den Hoed");
//        signs.add(emp);
//        System.out.println(signs);

        ArrayList<String> nums = new ArrayList<>(2);
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
//        System.out.println(nums);
//        nums.add(10, "Eleven"); //index 10 doesn't yet exist
//        System.out.println(nums);
//        for (int i = 0; i < nums.size(); i++){
//            System.out.println(nums.get(i));
//        }
//        for (String e : nums) { //same as 'for' above
//            System.out.println(e);
//        for (String e : nums) {
//            int i = nums.indexOf(e); //prints indexes of array
//            System.out.println("Item " + i + ":" + e);
//        }

//        Iterator e = nums.iterator();
//        while (e.hasNext()) {
//            String s = (String) e.next();
//            System.out.println(s);
//        }
//        nums.set(0,"Uno");
//        nums.set(1,"Dos");
//        nums.set(2,"Tres");
//        System.out.println(nums);

//        String first = nums.set(0,"Uno");
//        String second = nums.set(1,"Dos");
//        String third = nums.set(2,"Tres");
//        System.out.println(nums);
//        System.out.println("First: " + first);
//        System.out.println("Second: " + second);
//        System.out.println("Third: " + third);

//        ArrayList<String> newItems = new ArrayList<>(3);
//        newItems.add("Uno");
//        newItems.add("Dos");
//        newItems.add("Tres");
//
//        for (int i = 0; i < newItems.size(); i ++) {
//            System.out.println(nums.set(i,newItems.get(i))); //prints what is being replaced
//        }
//        System.out.println(nums); //prints what it was replaced with

        ArrayList<Employee> emps = new ArrayList<>();
        Employee emp1 = new Employee("Gomez", "Selena");
        Employee emp2 = new Employee("Tisdale", "Ashley");
        Employee emp3 = new Employee("Johnson", "Dwayne");

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        System.out.println("After adding: " + emps);
//        emps.remove(emp3);
//        System.out.println("After deleting: " + emps);

        ArrayList<Employee> emps2 = new ArrayList<>();
        emps2.add(emp1);
        emps2.add(emp2);
        emps.removeAll(emps2);
        System.out.println("Removes all but: " + emps);
//        emps.retainAll(emps2);
//        System.out.println("Retains all: " + emps);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

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