/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 *
 * @author desmo
 */
public class DataMerging {

    public static void main(String[] args) {
        //        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        //        Map<String, String> favorites = new HashMap<>();
        //        favorites.put("Johnny", "Bus Tour");
        //        favorites.put("V", "Tram");
        //        String johnny = favorites.merge("Johnny", "Skyride", mapper);
        //        String v = favorites.merge("V", "Skyride", mapper);
        //        System.out.println(favorites);
        //        System.out.println(johnny);
        //        System.out.println(v);

        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Suzan", null);
        favorites.merge("Ted", "Skyride", mapper);
        favorites.merge("Suzan", "Skyride", mapper);
        System.out.println(favorites); // {Ted=Skyride, Suzan=Skyride} only return null, if the mrge
    }
}
