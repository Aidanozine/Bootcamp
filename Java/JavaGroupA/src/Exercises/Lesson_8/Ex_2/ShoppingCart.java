
package Exercises.Lesson_8.Ex_2;

public class ShoppingCart {

    public static void main(String[] args) {
        Item a, b;
        a = new Item();
        b = new Item();

        a.setItemFields("Belt", 1, 29.50);
        a.displayItem();
        b.setItemFields("Shoes", 2, 45.50);
        b.displayItem();

        int retcodeA = a.setItemFields("Shirt", 1, 34.99, ' ');
        if (retcodeA < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } else {
            a.displayItem();
        }

        int retcodeB = b.setItemFields("Shirt", 1, 34.99, ' ');
        if (retcodeB < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } else {
            b.displayItem();
        }
    }
}
