/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class FlatMapZoo {

    public static void main(String[] args) {
//        List<String> zero = List.of();
//        List<String> one = List.of("bonobo");
//        List<String> two = List.of("Mamma Gorilla", "Baby Gorilla");
//        Stream<List<String>> animals = Stream.of(zero, one, two);
//        
//        animals.flatMap(m -> m.stream()).forEach(System.out::println);

        var zero = Stream.of();
        var one = Stream.of("bonobo");
        var two = Stream.of("Mamma Gorilla", "Baby Gorilla");
        Stream.concat(one, two).forEach(System.out::println);
    }
}
