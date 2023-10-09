/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class MinMax {

    public static void main(String[] args) {
        System.out.println("Min:");
        Stream<String> primatesA = Stream.of("monkey", "bonobo", "gorilla");
        Optional<String> min = primatesA.min((prim1, prim2) -> prim1.length() - prim2.length());
        min.ifPresent(System.out::println);

        System.out.println("Max:");
        Stream<String> primatesB = Stream.of("monkey", "bonobo", "gorilla");
        Optional<String> max = primatesB.max((prim1, prim2) -> prim1.length() - prim2.length());
        max.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());
        
        Optional<?> minFilled = Stream.of('a', 'b', 'c').min((s1, s2) -> 0);
        System.out.println(minFilled.isPresent());
        System.out.println(minFilled.get());

        Optional<?> maxEmpty = Stream.empty().min((s1, s2)-> 0);
        System.out.println(maxEmpty.isPresent());
    }
}
