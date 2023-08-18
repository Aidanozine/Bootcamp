
package Exercises.Lesson_6.Ex_2;

public class ShoppingCart {

    public static void main(String[] args) {
        Item a, b;
        a = new Item();
        b = new Item();

	    a.description = "Shirt";
        b.description = "Pants";

        a = b;
        System.out.println("Item 1: " + a.description);
        System.out.println("Item 2: " + b.description);

    } 
} 

