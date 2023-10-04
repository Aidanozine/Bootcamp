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
public class RoadsToTransformation {
    public static void main(String[] args) {
        Stream<String> primates = Stream.of("monkey", "gorilla", "bonobo", "mandrill");
        primates.map(String::length).forEach(System.out::println);
          
        //Varient of above
//        Stream<String> primates = Stream.of("monkey", "gorilla", "bonobo", "mandrill");
//        Stream<Integer> ans = primates.map(String::length);
//        ans.forEach(System.out::println);
    }
}
