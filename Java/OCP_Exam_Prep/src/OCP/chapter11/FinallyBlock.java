/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

/**
 *
 * @author desmo
 */
public class FinallyBlock {
    public static void main(String[] args) {
        FinallyBlock fb = new FinallyBlock();
        fb.explore();
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
        System.out.println("Keep going!");
    }
    
    void seeAnimals() {
        System.out.println("There's so many!");
    }
}
