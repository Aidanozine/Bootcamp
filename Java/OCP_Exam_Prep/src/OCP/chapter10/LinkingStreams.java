/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class LinkingStreams {

    public static void main(String[] args) {
//        var cats = new ArrayList<String>();
//        cats.add("Tigress");
//        cats.add("Tiger");
//        var stream = cats.stream();
//        cats.add("Zazzles");
//        System.out.println(stream.count());
//        System.out.println(cats);

        Stream<Integer> ints = Stream.of(100, 200, 100);
        Optional<Integer> op = ints.max((n, n2) -> n - n2);
        threeDigit(op);
        //        Optional<String> opt = Optional.of("123");
        //        Optional<Integer> result = opt.map(e -> e.length());

        Optional.of("123").map(String::length).stream().forEach(System.out::println);
    }

    private static void threeDigit(Optional<Integer> optional) {
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }
}
