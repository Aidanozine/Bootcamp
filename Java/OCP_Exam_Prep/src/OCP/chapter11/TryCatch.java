/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

/**
 *
 * @author desmo
 */
public class TryCatch {
    public static void main(String[] args) {
        TryCatch tc = new TryCatch();
        tc.explore();
    }

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            seeAnimals();
        }
        getUp();
    }

    void fall() {
        throw new RuntimeException();
    }
    
    void getUp(){
        System.out.println("Keep running!");
    }
    
    void seeAnimals() {
        System.out.println("Now, take this meat and walk in that direction.");
        System.out.println("And if you see a lion....run.");
    }
}
