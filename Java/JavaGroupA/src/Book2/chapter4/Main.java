package Book2.chapter4;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int appleCount = 3;

        String msg = "You have " + appleCount + " apple"
                + ((appleCount>1) ? "s." : ".");
        System.out.println(msg);

        String answer = sc.next();
        if (answer.equalsIgnoreCase("Yes!")) {
            System.out.print("They are equal.");
        }
        }
}
