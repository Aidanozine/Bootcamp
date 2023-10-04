/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class CollectingTest {

    public static void main(String[] args) {
        Stream<String> wolf = Stream.of("w", "o", "l", "f");
//        StringBuilder sb = wolf.collect(
//                StringBuilder::new,
//                StringBuilder::append, //accumulator
//                StringBuilder::append //combiner
//        );
//        System.out.println(sb);

//        TreeSet<String> tree = wolf.collect(
//                TreeSet::new,
//                TreeSet::add,
//                TreeSet::addAll
//        );
//        System.out.println(tree);

        TreeSet<String> tree = wolf.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(tree); 
    }

    private static class StringBulder {

        public StringBulder() {
        }
    }
}
