/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class Toucan {

//    public void fly(int[] lengths) {
//        System.out.println("Array of int");
//    }

    public void fly(int... lengths) {
        System.out.println("Vararg of int");
    } // DOES NOT COMPILE
    
    public static void main(String[] args) {
        Toucan t = new Toucan();
        t.fly(new int[] { 1, 2, 3 }); // either works
    }
}
