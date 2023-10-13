package OCP.Ch14;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InteractingWithUsers {
    public static void main(String[] args) throws Exception {
//        System.out.println("Enter text, please");
//        var reader = new BufferedReader(new InputStreamReader(System.in));
//        String userInput = reader.readLine();
//        System.out.println("You entered: " + userInput);

//        try (var out = System.out) {} //won't print
//        System.out.println("Hello");

//        var out = System.out; //working version of above
//        out.println("Hello");

//        System.out.println("Say something");
//        try (var out = System.out) {} //won't work
//        System.out.println("Hello");

//        System.out.println("Say something");
//        try (var out = System.out) { //working version of above
//            System.out.println("Hello");

//        System.out.println("Say something"); // won't work --> Console is unavailable
//        Console console = System.console();
//        if (console != null) {
//            String userInput = console.readLine();
//            console.writer().println("You entered: " + userInput);
//        } else {
//            System.err.println("Console not available");
//        }

        Console console = System.console(); //needs to run from cmd NB! DON'T FORGET TO REMOVE PACKAGE NAME
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            String name = console.readLine("Please enter your name: ");
            console.writer().format("Hi %s", name);
            console.writer().println();
            console.format("What is your address? ");
            String address = console.readLine();
            char[] password = console.readPassword("Enter a password "
                    + "between %d and %d characters: ", 5, 10);
            char[] verify = console.readPassword("Enter the password again: ");
            console.printf("Passwords "
                    + (Arrays.equals(password, verify) ? "match" : "do not match"));
        }

    }
}
