/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class PassingObjects {

    public static void main(String[] args) {
        String dogName = "Webby";
        speak(dogName);
        System.out.println("in main method: " + dogName);
    }

    public static void speak(String name) {
        System.out.println("in speak method: " + name);
        name = "Georgette";
        System.out.println("after change: " + name);
    }
}
