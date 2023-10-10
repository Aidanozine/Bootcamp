/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class GroupTesting {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, List<String>> map = ohMy.collect(
//                Collectors.groupingBy(String::length));
//        System.out.println(map);
//--------------------------------------------------------
//        Map<Integer, Set<String>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.toSet()));
//        System.out.println(map);
////--------------------------------------------------------
//TreeMap<Integer, Set<String>> map = ohMy.collect(
//Collectors.groupingBy(
//        String::length,
//        TreeMap::new,
//        Collectors.toSet())
//);
//        System.out.println(map);
//--------------------------------------------------------
//TreeMap<Integer, List<String>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        TreeMap::new,
//                        Collectors.toList())
//        );
//        System.out.println(map);
//--------------------------------------------------------
//        Map<Integer, Long> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.counting()));
//        System.out.println(map);
//--------------------------------------------------------
//        Map<Integer, Optional<Character>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.mapping(
//                                s -> s.charAt(0),
//                                Collectors.minBy((a, b) -> a - b))));
//        System.out.println(map);
//--------------------------------------------------------
var map = ohMy.collect(groupingBy(String::length,
        mapping(s -> s.charAt(0), minBy((a, b) -> a - b))));
        System.out.println(map); //uses static imports
    }
}
