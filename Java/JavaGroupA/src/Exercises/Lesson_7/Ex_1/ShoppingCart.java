
package Exercises.Lesson_7.Ex_1;

public class ShoppingCart {
    public static void main (String[] args){
        String cons = "Tom Middleton";
        String firstName;
        int spaceIdx;

        spaceIdx = cons.indexOf(" ");

        firstName = cons.substring(0, spaceIdx);
        System.out.println(firstName);
    }
}
