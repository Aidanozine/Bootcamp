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
public class FiniteStreams {

    public static void main(String[] args) {
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromParallelList = list.parallelStream();

        System.out.println("empty");
        Stream<String> empty = Stream.empty(); // count = 0
        empty.forEach(n -> System.out.println(n));
        System.out.println("singleElement");
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        singleElement.forEach(n -> System.out.println(n));
        System.out.println("fromArray");
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3
        fromArray.forEach(n -> System.out.println(n));
        System.out.println("streamA");
        Stream<Integer> streamA = Stream.iterate(1, n -> n < 10, n -> n + 2);
        streamA.forEach(n -> System.out.println(n));
    }
}
