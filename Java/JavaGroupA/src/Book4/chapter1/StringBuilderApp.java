package Book4.chapter1;

import java.util.Scanner;
public class StringBuilderApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your string: ");

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int vowelCount = 0;

        for (int i = 0; i < s.length(); i++) {
//            char c = s.toLowerCase().charAt(i); //same as below, but doesn't create a new string
            char c = Character.toLowerCase(sb.charAt(i));
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { //don't need all the brackets
                sb.setCharAt(i, '*');
                vowelCount ++;
            }
        }
        System.out.println(s);
        System.out.println(sb.toString());
        System.out.println("vowels changed " + vowelCount);
    }
}
