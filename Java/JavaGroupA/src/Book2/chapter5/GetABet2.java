package Book2.chapter5;
import java.util.Scanner;
public class GetABet2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double bank = 1000;
        double bet;

        System.out.println("You can bet anywhere between 1 and " + bank);
        do
        {
            System.out.print("Enter your bet: ");
            bet = sc.nextDouble();
            if ( (bet <= 0) || (bet > bank) ) {
                System.out.println("Invalid!");
            }
        } while ( (bet <= 0) || (bet > bank) );
        System.out.println("Your money will be safe here.");
    }
}
