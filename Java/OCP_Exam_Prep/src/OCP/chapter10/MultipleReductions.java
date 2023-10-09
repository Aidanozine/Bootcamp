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
public class MultipleReductions {
    public static void main(String[] args) {
        Stream<String> lupus = Stream.of("aw","o","l","f");
        int length = lupus.reduce(0, (i, s) -> i + s.length(), (a, b) -> a + b);
        System.out.println("String Length: " + length);
        
        Stream<Integer> numbers = Stream.of(2,4,6,8);
        int ans = numbers.reduce(1, (i, s) -> i * s);
        System.out.println(ans);
    }
}
