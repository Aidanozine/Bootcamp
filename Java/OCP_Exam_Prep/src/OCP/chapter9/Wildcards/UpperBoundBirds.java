/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.Wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desmo
 */
public class UpperBoundBirds {

    static class Sparrow extends Bird {
    }

    static class Bird {
    }

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
//        birds.add(new Sparrow()); // DOES NOT COMPILE
//        birds.add(new Bird()); // DOES NOT COMPILE
    }
}
