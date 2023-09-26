/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class PenguinGrowthSpurt {
    public static void main(String... args) {
        Penguin p1 = new Penguin();
        p1.name = "Layla";
        p1.tallestPenguinName = "Layla";
        
        Penguin p2 = new Penguin();
        p2.name = "William";
        p2.tallestPenguinName = "William";
        
        System.out.println("The pink penguin is named " + p1.name);
        System.out.println("The tallest penguin is named " + p1.tallestPenguinName);
        System.out.println("The blue penguin is named " + p2.name);
        System.out.println("The tallest penguin is named " + p2.tallestPenguinName);
    }
    
    public static class Penguin{
            String name;
            static String tallestPenguinName;
        }
}
