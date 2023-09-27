/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Bunny {
    String name;
    
    public Bunny(){ 
        System.out.println("Hop");
        this.name = name;
    }
    
    public Bunny(String name){ //won't print if void
        this.name = "Peter";
        System.out.println("Hop");
    }
    
    public static void main(String[] args) {
        var bA = new Bunny();
        var bB = new Bunny();
        var bC = new Bunny("Lucy");
        System.out.println(bA);
        System.out.println(bB);
        System.out.println(bC);
    }
}
