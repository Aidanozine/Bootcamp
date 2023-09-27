/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6.initializeObjects;

/**
 *
 * @author desmo
 */
class TheOtherOne extends InitializingClasses {
    public static void main(String[] args) {
        System.out.println("C");
        new TheOtherOne();
        new TheOtherOne();
        new TheOtherOne();
    }
    
    static{System.out.println("B");}
}
