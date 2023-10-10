/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

/**
 *
 * @author desmo
 */
public class Bunny {
    public static void main(String[] args) /*throws NoMoreCarrotsException*/ {
        try { //use this or the "throws NoMoreCarrotsException" above
        eatCarrot(6);
        } catch(NoMoreCarrotsException e){
            System.out.println(e);
        }
    }

    private static void eatCarrot(int carrotsLeft) throws NoMoreCarrotsException /*if not thrown --> try-catch block stops working*/ {
        if(carrotsLeft == 0){
            throw new NoMoreCarrotsException();
        }
        System.out.println("You have " + carrotsLeft + " 🥕🥕🥕🥕 remaining.");
    }
}

class NoMoreCarrotsException extends Exception { //use this or try-catch block
}