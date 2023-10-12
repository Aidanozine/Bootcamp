package OCP.Ch13.Threads;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamAndReduction {
    public static void main(String[] args) {
//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
//        ConcurrentMap<Integer, String> map = ohMy
//                .collect(Collectors.toConcurrentMap(String::length,
//                        k ->
//                                k,
//                        (s1, s2) ->
//                                s1 + "," + s2));
//        System.out.println(map); // {5=lions,bears, 6=tigers}
//        System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
//-------------------------------------GROUPINGBY--------------------------------
        var ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingByConcurrent(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}
