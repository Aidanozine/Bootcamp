/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

/**
 *
 * @author desmo
 */
public class MultiCatch {

    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }
    }
}
