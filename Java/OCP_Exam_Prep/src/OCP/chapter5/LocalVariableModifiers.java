/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class LocalVariableModifiers {

    public static void main(String[] args) {
        boolean isWeekend = false;

        final int rest;
        if (isWeekend) {
            rest = 5;
        } else {
            rest = 20;
        }
        System.out.println(rest);
        final var giraffe = new Animal();
        final String[] friends = new String[5];
//        rest = 10; // DOES NOT COMPILE
//        giraffe = new Animal(); // DOES NOT COMPILE
//        friends = null; // DOES NOT COMPILE

//        final int rest;
//        if (isWeekend) {
//            rest = 5;
//        }
//        System.out.print(rest); // DOES NOT COMPILE -- didn't assign an else
//        final Animal giraffe = new Animal(); // can't change (giraffe is final)
//        final int[] friends = new int[5]; // can't change (rest is final)
        giraffe.setName("George");
        System.out.println(giraffe);
        friends[2] = "Ross";
        System.out.println(friends[2]);
    }

    public String zooFriends() {
        String name = "Harry the Hippo";
        var size = 10;
        boolean wet;
        if (size > 100) {
            size++;
        }
        name.substring(0);
        wet = true;
        return name;
    }

    public class PolarBear {

        final int age = 10; // don't need default values, unless "final"
        final int fishEaten;
        final String name;

        {
            fishEaten = 10;
        }

        public PolarBear() {
            name = "Robert";
        }
    }
}

class Animal {

    String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
