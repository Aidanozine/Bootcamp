/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
public class NestedClass {

    private String greeting = "Hi"; // Outer class

    protected class Room { // Inner class

        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++) {
                greet(greeting);
            }
        }

        private static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() { // Instance method in outer class
        var room = new Room();
        room.enter();
    }

    public static void main(String[] args) {
        System.out.println("VersionA");
        var a = new NestedClass(); // Outer class instance
        a.enterRoom();

        System.out.println("VersionB");
        var b = new NestedClass();
        Room b2 = b.new Room(); // Create the inner class instance
        b2.enter();
        
        System.out.println("VersionC");
        new NestedClass().new Room().enter();
    }
}
