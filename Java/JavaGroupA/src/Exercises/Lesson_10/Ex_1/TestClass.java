
package Exercises.Lesson_10.Ex_1;


public class TestClass {
    public static void main (String args[]){
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);

        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary op, x = " + x);
    }
}
