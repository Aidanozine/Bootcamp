
package ExercisesJava.Lesson_7.Ex_3;

public class ShoppingCart {

    public static void main(String[] args) {
        int integer;
        
        long longNum1 = 10_987_654_321L;
        long longNum2 = 987_654_321L;
        float floater = 12.34F;
        char letter = 'A';

	    System.out.println("longNum1: " + longNum1);

        integer = (int) longNum1;
        System.out.println("longNum1 assigned to int var: " + integer);

        System.out.println("longNum2: " + longNum2);

        integer = (int) longNum2;
        System.out.println("longNum2 assigned to int var: " + integer);

        System.out.println("floater: " + floater);

        integer = (int) floater;
        System.out.println("Float assigned to int var: " + integer);

        System.out.println("letter: " + letter);

        integer = (int) letter;
        System.out.println("Letter assigned to int var: " + integer);
    }
}
