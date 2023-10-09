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
public class PositionRestriction {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(2, n -> n + 2);
        s.skip(1).limit(4).forEach(System.out::println);
    }
}
