package Book2.chapter5;
import java.util.Scanner;
public class GetABet3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double bank = 1000;
        double bet;
        boolean validBet;

        System.out.println("You can bet anywhere between 1 and " + bank);
        do
        {
            validBet = true;
            System.out.print("Enter your bet: ");
            bet = sc.nextDouble();
            if ( (bet <= 0) || (bet > bank) ) {
                System.out.println("Invalid!");
                validBet = false;
            }
        } while (!validBet);
        System.out.println("Your money will be safe here.");
    }
}
