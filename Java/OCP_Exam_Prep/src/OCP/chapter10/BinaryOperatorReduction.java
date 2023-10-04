/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class BinaryOperatorReduction {

    public static void main(String[] args) {
        BinaryOperator<Integer> bo = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> multiElement = Stream.of(3, 4, 5);

        empty.reduce(bo).ifPresent(System.out::println);
        oneElement.reduce(bo).ifPresent(System.out::println);
        multiElement.reduce(bo).ifPresent(System.out::println);
    }
}
