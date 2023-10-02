
package ExercisesJava.Lesson_11.Ex_2;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;
        if (args.length < 2) {
                System.out.println("Invalid arg list.  There must be 2 arguments");
        } else {
                name = args[0];
                age = Integer.parseInt(args[1]);
                System.out.println("Name = "+name+", Age = "+age);
        }
    }
}
