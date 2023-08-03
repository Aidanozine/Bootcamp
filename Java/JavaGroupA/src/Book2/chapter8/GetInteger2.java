package Book2.chapter8;
import java.util.Scanner;
public class GetInteger2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer, please: ");
        int i = getAnInteger();
        System.out.println("You entered " + i);
    }

    public static int getAnInteger() {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("What you entered is not an integer.");
        }
        return sc.nextInt();
    }
}
