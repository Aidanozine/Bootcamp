/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author desmo
 */
public class TestMap {

    public static void main(String[] args) {
//        Map.of("Name", "Fred", "Surname", "Jones");

//        Map.ofEntries(
//                Map.entry("Name", "Fred"),
//                Map.entry("Surname", "Jones"));
//        Map<String, String> map = Map.ofEntries(
//                Map.entry("Name", "Fred"),
//                Map.entry("Surname", "Jones")
//        );
//
//        Map<String, String> map2 = Map.copyOf(map);
//
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key + " " + map.get(key));
//        }
//        
//        Set<String> keys2 = map2.keySet();
//        for(String key2 : keys2) {
//            System.out.println(key2 + " " + map2.get(key2));
//        }
//        Map<String, String> animalia = new HashMap<>();
//        animalia.put("Panda", "Bamboo");
//        animalia.put("Lion", "Meat");
//        animalia.put("Shark", "Tank cleaner");
//        System.out.println(animalia);
//        System.out.println("Put out job for new tank cleaner....");
//        System.out.println(animalia.get("Lion"));
//        for(String k : animalia.keySet()){
//            System.out.println(k + " " + animalia.get(k));
//        }
//        System.out.println(animalia.containsKey("Lion"));
//        System.out.println(animalia.containsValue("Lion"));
//        System.out.println(animalia.containsValue("Meat"));
//        System.out.println(animalia.size());
//        animalia.clear();
//        System.out.println(animalia.size());
//        System.out.println(animalia.isEmpty());
//        Map<Integer, Character> charMap = new HashMap<>();
//        charMap.put(1, 'x');
//        charMap.put(2, 'y');
//        charMap.put(3, 'z');
//        charMap.forEach((keyWord, value) -> System.out.println(keyWord + ":" + value));
//        charMap.values().forEach(val -> System.out.println(val));
//        charMap.entrySet().forEach(key -> System.out.println(key));
//        charMap.values().forEach(System.out::println);
//        charMap.entrySet().forEach(System.out::println);
//        charMap.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
//        Map<Character, String> hashmap = new HashMap<>();
//        hashmap.put('a', "target");
//        System.out.println("A marks the " + hashmap.get('a'));
//        System.out.println("A marks the " + hashmap.getOrDefault('a', ""));
//        System.out.println("E marks the " + hashmap.get('e'));
//        System.out.println("E marks the " + hashmap.getOrDefault('e', ""));
//
//        Map<Integer, Integer> hm = new HashMap<>();
//        hm.put(1, 2);
//        hm.put(2, 4);
//        Integer original = hm.replace(2, 10);
//        System.out.println("key 2: value 4 -> 10");
//        System.out.println(hm);
//        System.out.println("value -> key + value");
//        hm.replaceAll((key, val) -> key + val);
//        System.out.println(hm);


        Map<String, String> fav = new HashMap<>();
        fav.put("Jenny", "Bus Tour");
        fav.put("Tom", null);
        fav.putIfAbsent("Jenny", "Tram");
        fav.putIfAbsent("Sam", "Tram");
        fav.putIfAbsent("Tom", "Tram");
        System.out.println(fav); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
    }
}
