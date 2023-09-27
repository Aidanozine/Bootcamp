/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter6;

/**
 *
 * @author desmo
 */
public class Ursine {

    public static void eat() {
        System.out.println("The bear is eating.");
    }
}

class Panda extends Bear {

//    public static void eat() { //when active - hides the eat() from class Ursine
//        System.out.println("Panda is chewing");
//    }

    public static void main(String[] args) {
        Ursine.eat();
    }
}
