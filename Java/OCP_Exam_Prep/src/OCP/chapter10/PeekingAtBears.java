/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class PeekingAtBears {

//    public static void main(String[] args) {
//        var voyeur = Stream.of("Bears", "Brown", "Grizzly");
//        long count = voyeur.filter(s -> s.startsWith("G")).peek(System.out::println).count();
//        System.out.println(count);      

    public static void main(String[] args) {
        var voyeur = Stream.of("Bears", "Brown", "Grizzly");
        long count = voyeur.filter(s -> s.startsWith("B")).peek(System.out::println).count();
        System.out.println(count);
    }
}
