package Book2.chapter6;
import java.util.Scanner;
public class SpaApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to our SPA APPLICATION!\n\n");

        System.out.println("Please select what treatment package you want: ");
        String treatment = sc.next();
        treatment = treatment.toLowerCase();
        char spaPackage = treatment.charAt(0);

        String details = "";

        switch (spaPackage) {
            case 'a':
                details += "\tHead massage\n";

            case 'b':
                details += "\tHand massage\n";

            case 'c':
                details += "\tFoot massage\n";

            case 'd':
                details += "\tBack massage\n";

            case 'e':
                details += "\tSauna\n";
                break;

            default:
                details = "\tSo sorry, that's not one of our packages.\n";
                break;
        }
        System.out.println("That package includes: ");
        System.out.println(details);
    }
}
