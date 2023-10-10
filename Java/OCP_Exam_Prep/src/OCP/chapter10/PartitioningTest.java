/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class PartitioningTest {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Boolean, List<String>> map = ohMy.collect(
//                Collectors.partitioningBy(s -> s.length() <= 5));
//        System.out.println(map);
//-------------------------------------------------------------
//        Map<Boolean, List<String>> map = ohMy.collect(
//                Collectors.partitioningBy(s -> s.length() <= 7));
//        System.out.println(map);
//-------------------------------------------------------------
        Map<Boolean, Set<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map);
    }
}
