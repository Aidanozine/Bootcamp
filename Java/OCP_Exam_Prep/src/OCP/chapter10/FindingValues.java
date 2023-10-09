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
public class FindingValues {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.findAny().ifPresent(System.out::println); // monkey (usually)
        
        Stream<String> infinite = Stream.generate(()-> "chimp");
        infinite.findAny().ifPresent(System.out::println); // chimp
    }
}
