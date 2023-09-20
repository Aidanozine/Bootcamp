/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter2;

import java.io.File;

/**
 *
 * @author desmo
 */
public class Unary {

    static String a;
    static String b;

    //Logical 
    public static void main(String[] args) {
        boolean isAnimalAsleep = false;
        System.out.println("isAnimalAsleep: " + isAnimalAsleep); // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println("!isAnimalAsleep: " + isAnimalAsleep); // true

        //Bitwise Complement
        int value = 3; // Stored as 0011
        int complement = ~value; // Stored as 1100
        System.out.println("original: " + value); // 3
        System.out.println("complemented: " + complement); // -4

        //Negation Operator
        double zooTemperature = 1.21;
        System.out.println("zooTemperature: " + zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println("-zooTemperature: " + zooTemperature); // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println("-(-zooTemperature): " + zooTemperature); // -1.21
        zooTemperature = --zooTemperature;
        System.out.println("--zooTemperature: " + zooTemperature);

        //Increment / Decrement Opertors
        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1
        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance--); // 1
        System.out.println(parkAttendance); // 0

        //Division / Modulus Operators
        System.out.println(9 / 3); // 3
        System.out.println(9 % 3); // 0
        System.out.println(10 / 3); // 3
        System.out.println(10 % 3); // 1
        System.out.println(11 / 3); // 3
        System.out.println(11 % 3); // 2
        System.out.println(12 / 3); // 4
        System.out.println(12 % 3); // 0

        //Casting
        System.out.println("====Assignment & Casting====");
        int g = 50; // (50) --> int (50)
        float h = 5; //int (5) --> float (5)
        long l = 8; //int (8) --> long (8)

//        int f = 5.0f;
        int f = (int) 5.0f;
        System.out.println(f);
        int k = (int) 8L; //long (8) --> int (8)

//        float egg = 2.0 / 9; // DOES NOT COMPILE
        float egg1 = (float) (2.0 / 9);
        System.out.println("cast as float: " + egg1);
        float egg2 = 2.0f / 9;
        System.out.println("assingment as float: " + egg2);

//        int tadpole = (int) 5 * 2L; // DOES NOT COMPILE
        int tadpole1 = (int) (5 * 2L);
        System.out.println("tadpole cast as int: " + tadpole1);
        long tadpole2 = 5 * 2L;
        System.out.println("tadpole assignment as long:" + tadpole2);

//        short frog = 3 - 2.0; // DOES NOT COMPILE
        short frog1 = (short) (3 - 2.0);
        System.out.println("frog cast as short: " + frog1);
        double frog2 = 3 - 2.0f;
        System.out.println("frog assignment as double from float: " + frog2);
        double frog3 = 3 - 2.0;
        System.out.println("frog assignment as double: " + frog3);

//        int fish = 1.0; // DOES NOT COMPILE
        int fish = (int) 1.0;
        System.out.println("fish cast as int: " + fish);
//        short bird = 1921222; // DOES NOT COMPILE
        short bird = (short) 1921222;
        System.out.println("bird cast as short: " + bird); //overflow - changes int value to fit in short
//        int mammal = 9f; // DOES NOT COMPILE
        int mammal = (int) 9f;
        System.out.println("mammal cast as int: " + mammal);
//        long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE
//        long reptile = (long) 192_301_398_193_810_323; //error compiles before casting
        long reptile = 192_301_398_193_810_323L;
        System.out.println("reptile changed to long: " + reptile);
        long intMax1 = (long) (Integer.MAX_VALUE);
        System.out.println("max int cast as long: " + intMax1);
        long intMax2 = (long) (Integer.MAX_VALUE + 1);
        System.out.println("max int cast as long: " + intMax2); //overflow leading to wrap-around
        long intMax3 = (Integer.MAX_VALUE);
        System.out.println("max int cast as long: " + intMax3);
        long intMax4 = (long) (Integer.MAX_VALUE) + 1;
        System.out.println("max int cast as long: " + intMax4);

        short mouse = 10;
        short hamster = 3;
//        short capybara = mouse * hamster; // DOES NOT COMPILE //short always promotes with arithmatic signs
        short capybara = (short) (mouse * hamster);
        System.out.println("capybara cast as short: " + capybara);

        //Casting Values Vs. Variables
        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;
//        short boots = 2 + hat; // DOES NOT COMPILE
        short boots2 = (short) (2 + hat);
        short boots3 = (short) (hat + hat);
//        byte gloves = 7 * 100; // DOES NOT COMPILE
        byte gloves2 = (byte) (7 * 100);

        //Compound Assignment
        int camel = 2, moose = 3;
//        camel = camel * moose;
        camel *= moose;
        System.out.println("camel: " + camel);

        //Assignment / Equality Operators
//        boolean monkey = true == 3; // DOES NOT COMPILE
//        boolean ape = false != "Grape"; // DOES NOT COMPILE
//        boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE
        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar); // true

        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday); // false
        System.out.println(tuesday == wednesday); // true

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        //Logical Operators
        boolean eyesClosed = true;
        boolean breathingSlowly = true;
        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println(resting); // true
        System.out.println(asleep); // true
        System.out.println(awake); // false

        //Conditional Operators
        int hour = 10;
        boolean zooOpen1 = true || (hour < 4);
        System.out.println("zooOpen1: " + zooOpen1); // true

        boolean zooOpen2 = (hour < 4) || true;
        System.out.println("zooOpen2: " + zooOpen2); // true

        int rabbit = 6;
        boolean bunnyA = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println("rabbitA: " + rabbit);
        System.out.println("bunnyA: " + bunnyA);
        boolean bunnyB = (++rabbit <= 7) || (rabbit >= 6);
        System.out.println("rabbitB: " + rabbit);
        System.out.println("bunnyB: " + bunnyB);
        boolean bunnyC = (rabbit >= 6) | (++rabbit <= 7);
        System.out.println("rabbitC: " + rabbit);
        System.out.println("bunnyC: " + bunnyC);

        //Ternary Operators
        int owl = 5;
        int food;
        if (owl < 2) {
            food = 3;
        } else {
            food = 4;
        }
        System.out.println(food); // 4

        food = owl < 2 ? 3 : 4;
        System.out.println(food); // 4

        food = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);
        System.out.println(food);

        if (owl < 4) {
            if (owl > 2) {
                food = 3;
            } else {
                food = 4;
            }
        } else {
            food = 5;
        }
        System.out.println(food);

        int sheep = 1;
        int zzz = 1;
        int sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep," + zzz); // 2,1
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
        sleep = sheep < 10 ? sheep++ : zzz++;
        System.out.println(sheep + " sheep,," + zzz);
    }
}
