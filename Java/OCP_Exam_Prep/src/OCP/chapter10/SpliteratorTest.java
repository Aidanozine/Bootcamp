/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class SpliteratorTest {

    public static void main(String[] args) {
//        var stream = List.of("bird-",
//                "bunny-",
//                "cat-",
//                "dog-",
//                "fish-",
//                "lamb-",
//                "mouse-");
//        Spliterator<String> originalBagOfFood = stream.spliterator();
//        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
//        emmasBag.forEachRemaining(System.out::print); // bird-bunny-cat-
//        Spliterator < String > jillsBag = originalBagOfFood.trySplit();
//        jillsBag.tryAdvance(System.out::print); // dog-20:
//        jillsBag.forEachRemaining(System.out::print); // fish-21:
//        originalBagOfFood.forEachRemaining(System.out::print);

//        var originalBag = Stream.iterate(1, n -> ++n).spliterator();
//        Spliterator<Integer> newBag = originalBag.trySplit();
//        newBag.tryAdvance(System.out::println);
//        newBag.tryAdvance(System.out::println);
//        newBag.tryAdvance(System.out::println);
//--------------------------------------------------------------
        var ohMy = Stream.of("lions", "tigers", "bears");
//        String inTheWoods = ohMy.collect(Collectors.joining(" and "));
//        System.out.println(inTheWoods); // lions, tigers, bears

//        Double ohMyNumbers = ohMy.collect(Collectors.averagingInt(String::length));
//        System.out.println(ohMyNumbers);

//        TreeSet<String> hungriest = ohMy.filter(s -> s.startsWith("t"))
//                .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println("They will be eaten by " + hungriest + ".");
        
//        Map<String, Integer> mapOfOz = ohMy.collect(Collectors.toMap(s -> s, String::length));
//        System.out.println(mapOfOz);
        
        Map<Integer, String> mapOfOz = ohMy.collect(Collectors
                .toMap(String::length, k -> k, (s1, s2) -> s1 + ", " + s2));
        System.out.println(mapOfOz);
        System.out.println(mapOfOz.getClass()); //bottom pg574 ->Grouping
    }
}
