/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desmo
 */
public class Mammal {

    public List<CharSequence> play() {
        return new ArrayList<>();
    }

    public CharSequence sleep() {
        return "Hello";
    }
}

class Monkey extends Mammal {

    public ArrayList<CharSequence> play() {
        return new ArrayList<>();
    }
}

class Goat extends Mammal {

//    public List<String> play() {
//    } // DOES NOT COMPILE

    public String sleep() {
        return "Universe";
    }
}
