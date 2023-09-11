package Book5.chapter4;

import javax.swing.text.DateFormatter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayFun {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            LocalDate birthDate;
            DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM d, YYYY");
            DateTimeFormatter monthDayFormat = DateTimeFormatter.ofPattern("MMMM d");
            System.out.println("Today is " + LocalDate.now().format(fullFormat) + ".");

            System.out.println();
            System.out.println("Please enter your birthdate (YYYY-MM-DD): ");
            String input = sc.nextLine();

            try {
                birthDate = LocalDate.parse(input);
                if (birthDate.isAfter(LocalDate.now())){
                    System.out.println("You're not even a twinkle in your mother's eye");
                    continue;
                } else {
                    System.out.println(birthDate.format(fullFormat) + " was a good day!");
                }

                DayOfWeek birthDayOfWeek = birthDate.getDayOfWeek();
                System.out.println("You were born on a " + birthDayOfWeek + ".");

                long years = birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
                System.out.println("You are currently " + years + " years old");

                LocalDate nextBDay = birthDate.plusYears(years + 1);
                System.out.println("Your next birthday is: " + nextBDay.format(fullFormat));

                long wait = LocalDate.now().until(nextBDay, ChronoUnit.DAYS);
                System.out.println("There are " + wait + " days till then");

                LocalDate halfBirthday = birthDate.plusMonths(6);
                System.out.println("Your half-birthday is: " + halfBirthday.format(monthDayFormat) + ".");
            } catch(DateTimeParseException ex) {
                System.out.println("Sorry that date isn't an option.");
            }

        } while(askAgain());
    }

    private static boolean askAgain(){
        System.out.println();
        System.out.println("Another? (Y or N)");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")){
            return true;
        } else {
            return false;
        }
    }
}