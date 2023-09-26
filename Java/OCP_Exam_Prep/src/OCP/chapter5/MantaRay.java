/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class MantaRay {
    private static void first(){
        System.out.println("First");}
    
    private static void second(){
        System.out.println("Second");}
    
    private /**static*/ void third(){ //must be "static" to be referenced
        System.out.println("Third");}
    
    public static void main(String[] args) {
        first();
        second();
//        third(); //pg246
    }
}
