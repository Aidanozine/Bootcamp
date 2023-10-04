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
public class KillAllClones {
    public static void main(String[] args) {
        Stream<String> unique = Stream.of("Clone trooper", "Clone trooper", "Jedi", "Clone trooper");
        unique.distinct().forEach(System.out::println);
    }
}
