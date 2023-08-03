package Book2.chapter8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play.");

        do {
            playARound();
        } while
            (askForAnotherRound());
            System.out.println("\nThanks for playing!");
    }

    public static void playARound() {
        boolean validInput;
        int number, guess;
        String answer;

        //System picks a number
        number = getRandomNumber(1,10); //brackets aren't empty if using variant 3B

        //Asks for user's guess
        System.out.println("\nI'm thinking of a number" + "between 1 and 10.");
        System.out.println("Try and guess it.");
        guess = getGuess();

        //Checks user input
        if (guess == number) {
            System.out.println("What?! How'd you get it right?!");
        } else {
            System.out.println("HA HA HA!\nI knew you wouldn't get it." + "\nThe number was " + number);
        }
    }

    public static int getRandomNumber(int min, int max) { //variant 3B
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static int getGuess() {
        int guess = 0;
        do {
            try {
                guess = sc.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Please enter number: ");
            }
            if ((guess < 1) || (guess > 10)) {
                System.out.println("Nope." + "\nOnly between 1 and 10." + "\nTry again.");
            } else {
                return guess;
            }
            sc.next();
        } while (true);
    }

    public static boolean askForAnotherRound() {
        boolean validInput;
        do {
            String answer;
            System.out.println("Shall we go again?" + "(Y or N)");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else {
                if (answer.equalsIgnoreCase("N")) {
                    return false;
                }
            }
        } while (true);
    }
}