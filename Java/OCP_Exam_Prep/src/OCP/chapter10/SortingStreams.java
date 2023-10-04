/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class SortingStreams {

    public static void main(String[] args) {
//        Stream<String> s = Stream.of("Brown-", "Bear-", "Apple-");
//        s.sorted().forEach(System.out::println);

//        Stream<String> s = Stream.of("Brown-", "Bear-", "Apple-");
//        s.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Stream<String> s = Stream.of("Brown-", "Bear-", "Apple-");
        s.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
