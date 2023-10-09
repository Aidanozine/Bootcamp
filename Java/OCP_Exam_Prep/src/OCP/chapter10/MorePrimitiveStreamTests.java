/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class MorePrimitiveStreamTests {

    public static void main(String[] args) {
        //        var random = DoubleStream.generate(Math::random);
        //        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        //        random.limit(3).forEach(System.out::println);
        //        fractions.limit(3).forEach(System.out::println);

        //        IntStream range = IntStream.range(1, 11); //remember: second number not inncluded in output
        //        range.forEach(System.out::println);
        //-------------------------------------------------
        //        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        //        count.forEach(System.out::println);
        //-------------------------------------------------
        //        IntStream.range(1, 6).forEach(System.out::println);
        //-------------------------------------------------
        //        IntStream.iterate(1, n -> n + 1).forEach(System.out::println);
        //-------------------------------------------------
        Stream.of("penguin", "fish")
                .peek(System.out::println)
                .mapToInt(s -> s.length())
                .forEach(System.out::println);
    }

    private static Stream<Integer> mapping(IntStream stream) {
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }
}
