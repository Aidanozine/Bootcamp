package Book5.chapter2;

import java.util.regex.*;
import java.util.Scanner;

public final class Reg {
    static String r, s;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Regex Tester");

        do {
            do {
                System.out.println("Enter Regex: ");
                r = sc.nextLine();
                validRegex = true;

                try {
                    pattern = Pattern.compile(r);
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            } while (!validRegex);
            doneMatching = false;
            while (!doneMatching) {
                System.out.println("Enter String: ");
                s = sc.nextLine();
                if (s.length() == 0){
                    doneMatching = true;
                } else {
                    matcher = pattern.matcher(s);
                    if (matcher.matches()){
                        System.out.println("It's a match!");
                    } else {
                        System.out.println("No match!");
                    }
                }
            }
        } while (askAgain());
    }

    private static boolean askAgain(){
        System.out.println("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")){
            return true;
        }
        return false;
    }
}
