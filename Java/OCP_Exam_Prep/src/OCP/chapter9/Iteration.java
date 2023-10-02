/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author desmo
 */
public class Iteration {
    public static void main(String[] args) {
        Collection<String> cats = List.of("Sissy", "Tom");
        System.out.println("----methodRef:----");
        cats.forEach(System.out::println);
        System.out.println("----lambda:----");
        cats.forEach(c -> System.out.println(c));
    }
}
