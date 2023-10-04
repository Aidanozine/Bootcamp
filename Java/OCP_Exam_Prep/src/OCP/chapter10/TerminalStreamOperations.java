/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.List;

/**
 *
 * @author desmo
 */
public class TerminalStreamOperations {
    public static void main(String[] args) {
        List numbers = List.of(3, 6, 9, 12, 15);
        long count = numbers.stream().count();
        System.out.println("Number of elements: " + count);
    }
}
