package Book2.chapter8;

public class DivideByZero {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Oops, you tried to divide by zero.");
        }
    }
}
