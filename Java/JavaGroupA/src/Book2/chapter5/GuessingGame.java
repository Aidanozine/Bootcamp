package Book2.chapter5;
import java.util.Scanner;
public class GuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;
        System.out.println("We're gonna play a guessing game!");
        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;

            number = (int)(Math.random() * 10) + 1;

            System.out.println("\nI'm thinking of a number " + "between 1 and 10.");
            System.out.print("What's the number?");
            do {
                guess = sc.nextInt();
                validInput = true;
                if ( (guess < 1) || (guess > 10) ) {
                    System.out.println("Between 1 and 10 only!" + "Try again: ");
                    validInput = false;
                }
            } while (!validInput);

            if (guess == number) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!" + " " + "The number was " + number);
            }
            do {
                System.out.println("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y"));
                else {
                    if (answer.equalsIgnoreCase("N")) {
                        keepPlaying = false;
                    } else {
                        validInput = false;
                    }
                }
            } while (!validInput);
        }
        System.out.println("\nThanks for playing");
    }
}
