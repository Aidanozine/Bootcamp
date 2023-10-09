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
public class PrimitiveStreamTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce(0, (s,n) -> s + n));
        //Variant of above
        Stream<Integer> stream2 = Stream.of(1,2,3);
        System.out.println(stream2.mapToInt(x -> x).sum());
    }
}
