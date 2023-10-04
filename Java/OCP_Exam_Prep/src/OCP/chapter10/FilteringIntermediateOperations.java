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
public class FilteringIntermediateOperations {
    public static void main(String[] args) {
        Stream<String> primates = Stream.of("monkey", "gorilla", "bonobo", "mandrill");
        primates.filter(x -> x.startsWith("m")).forEach(System.out::println);
    }
}
