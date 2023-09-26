/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter3;

/**
 *
 * @author desmo
 */
public class SwitchExpression {

    public static void main(String[] args) {
        printDayOfWeek(5);
        printSeason(3);
        printFish();
        printFish2();
        printSeason2(8);
        printSeason3(0);
        printMeasurements(40);
        dogSearch(3);
        dogSearch2("Lupus");
        findZookeeper(30);
    }

//    public static void printDayOfWeek(int day) {
//        var result = switch (day) {
//            case 0 ->
//                "Sunday";
//            case 1 ->
//                "Monday";
//            case 2 ->
//                "Tuesday";
//            case 3 ->
//                "Wednesday";
//            case 4 ->
//                "Thursday";
//            case 5 ->
//                "Friday";
//            case 6 ->
//                "Saturday";
//            default ->
//                "How many days do you have in a week?";
//        };
//        System.out.println(result);
//    }
    public static void printDayOfWeek(int day) {
        var result = switch (day) {
            case 0 ->
                "Sunday";
            case 1 ->
                "Monday";
            case 2 ->
                "Tuesday";
            case 3 ->
                "Wednesday";
            case 4 ->
                "Thursday";
            case 5 ->
                "Friday";
            case 6 ->
                "Saturday";
            default ->
                "How many days do you have in a week?";
        };
        System.out.println(result);
    }

    public static void printSeason(int season) {
        var result = switch (season) {
            case 0 ->
                "Spring";
            case 1 ->
                "Summer";
            case 2 ->
                "Autumn";
            case 3 ->
                "Winter";
            default ->
                "How many seasons do you think there are?";
        };
        System.out.println(result);
    }

    public static void printFish() {
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 ->
                "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) {
                    yield "Blobfish";
                } else {
                    yield "Green";
                }
            }
            default ->
                "Swordfish";
        };
        System.out.println(name);
    }

    public static void printFish2() {
        int fish = 3;
        int length = 1;
        var name = switch (fish) {
            case 1 ->
                "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) {
                    yield "Blobfish";
                }
                yield "Green";
            }
            default ->
                "Swordfish";
        };
        System.out.println(name);
    }

    public static void printSeason2(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.println("Winter");
            case 4, 5, 6:
                System.out.println("Spring");
            default:
                System.out.println("Unknown");
            case 7, 8, 9:
                System.out.println("Summer");
            case 10, 11, 12:
                System.out.println("Fall");
        }
    }

    public static void printSeason3(int season) {
        var result = switch (season) {
            case 0 -> {
                System.out.println("Hi");
                yield "Spring";
            }
            case 1 -> {
                yield "Summer";
            }
            case 2 -> {
                yield "Autumn";
            }
            case 3 -> {
                yield "Winter";
            }
            default ->
                "How many seasons do you think there are?";
        };
        System.out.println(result);
    }

    public static void printMeasurements(int measurement) {
        int size = switch (measurement) {
            case 5 ->
                1;
            case 10 ->
                (short) 2;
            default ->
                5;
//        case 20 ->
//            "3"; // DOES NOT COMPILE
//        case 40 ->
//            4L; // DOES NOT COMPILE
            case 40 ->
                (int) 4L;
//        case 50 ->
//            null; // DOES NOT COMPILE
        };
        System.out.println(size);
    }

    public static void dogSearch(int canis) {
        String type = switch (canis) { // DOES NOT COMPILE
            case 1 ->
                "dog";
            case 2 ->
                "wolf";
            case 3 ->
                "coyote";
            default ->
                "That's a cat.....";
        };
        System.out.println(type);
    }

    public static void dogSearch2(String canis) {
        String type = switch (canis) { // DOES NOT COMPILE
            case "Familiaris" ->
                "dog";
            case "Lupus" ->
                "wolf";
            default ->
                "That's a cat.....";
        };
        System.out.println(type);
    }

    static void findZookeeper(int id) {
        System.out.println(switch (id) {
            case 10 -> {
                yield "Jane";
            }
            case 20 -> {
                yield "Lisa";
            }
            case 30 ->
                "Kelly";
            case 31 ->
                "Sarah";
            default ->
                "Unassigned";
        });
    }
}
