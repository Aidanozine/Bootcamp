/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Bird {

    private final boolean hasFeathers() {
        return true;
    }

    private final static void flyAway() {
    }
}

class Penguin extends Bird {

    public final boolean hasFeathers() { // won't compile if Bird hasFeathers() is public
        return false;
    }

    public final static void flyAway() { // won't compile if Bird flyAway() is public
    } // DOES NOT COMPILE
}
