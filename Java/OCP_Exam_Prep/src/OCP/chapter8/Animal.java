/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desmo
 */
//public record Animal(String species, boolean canHop, boolean canSwim) {}
//
//interface CheckTrait {
//
//    boolean test(Animal a);
//}
//
//class CheckIfHopper implements CheckTrait {
//
//    @Override
//    public boolean test(Animal a) {
//        return a.canHop();
//    }
//}
//
//class TraditionalSearch {
//
//    public static void main(String[] args) {
//        var animals = new ArrayList<Animal>();
//        animals.add(new Animal("fish", false, true));
//        animals.add(new Animal("kangaroo", true, false));
//        animals.add(new Animal("rabbit", true, false));
//        animals.add(new Animal("turtle", false, true));
//        
//        print(animals, new CheckIfHopper());
//    }
//    
//    private static void print(List<Animal> animals, CheckTrait checker){
//        System.out.println("Species that hop:");
//        for(Animal animal : animals){
//            if(checker.test(animal)){
//                System.out.println(animal + " ");
//            }
//        }
//        System.out.println();
//    }
//}
public record Animal(String species, boolean canHop, boolean canSwim) {

}

@FunctionalInterface
interface CheckTrait {

    boolean test(Animal a);
}

@FunctionalInterface
interface Sprint {

    public void sprint(int speed);
}

@FunctionalInterface
interface Dash extends Sprint {
}

interface Skip extends Sprint {

    void skip();
}

interface Sleep {

    private void snore() {
    }

    default int getZzz() {
        return 1;
    }
}

interface Climb {

    void reach();

    default void fall() {
    }

    static int getBackUp() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }
}

interface Soar {

    abstract String toString();
}

@FunctionalInterface
interface Dive {

    String toString();

    public boolean equals(Object o);

    public abstract int hashCode();

    public void dive();
}

//interface Hibernate { //not a @FunctionalInterface
//
//    String toString();
//
//    public boolean equals(Hibernate o);
//
//    public abstract int hashCode();
//
//    public void rest();
//}

@FunctionalInterface
interface Hibernate {

    String toString();

    public boolean equals(Object o); //making it an object makes it a @FunctionalInterface

    public abstract int hashCode(); //if hashCode(String)then NOT @FunctionalInterface

    public void rest();
}

class Tiger implements Sprint {

    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}

//class CheckIfHopper implements CheckTrait { //made redundant by Line 77
//    @Override
//    public boolean test(Animal a) {
//        return a.canHop();
//    }
//}
class TraditionalSearch {

    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

//        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
//        System.out.println("Species that hop:");
        System.out.println("Species that swim:");
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }
}
