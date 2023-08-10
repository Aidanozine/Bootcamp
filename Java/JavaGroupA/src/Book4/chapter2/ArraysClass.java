package Book4.chapter2;

import java.util.Scanner;

public class ArraysClass {
//    String[] names = new String[10]; //same as below
//    String names [] = new String[10]; //same as above
    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.print("How many players? ");
//        int count = sc.nextInt();
//        String[] players = new String[count];
//        System.out.println(players.length);
//    }

//    public static void main(String[] args) {
//        String[] days = new String[7];
////        days[0] = "Sunday";
////        days[1] = "Monday";
////        days[2] = "Tuesday";
////        days[3] = "Wednesday";
////        days[4] = "Thursday";
////        days[5] = "Friday";
////        days[6] = "Saturday";
//
//        String[] days = { "Sunday", "Monday", "Tuesday", //alternative to above
//                "Wednesday", "Thursday",
//                "Friday", "Saturday" };
//    }

    public static void main(String[] args) {
//        int[] numbers = new int[100];
//        for (int i = 0; i < 100; i++ ) {
//            numbers[i] = (int) (Math.random() * 100) + 1;
//            System.out.println(numbers[i]);
//        }

        System.out.println("How many players are there? ");
        int count = sc.nextInt();
        sc.nextLine(); //consumes next line
        String[] players = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter the player's name: ");
            players[i] = sc.nextLine();
        }
        System.out.println("The players are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(players[i]);
        }
    }
}
