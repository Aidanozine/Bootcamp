/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author desmo
 */
public class Friends {

    public static void main(String[] args) {
//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        List<String> filtered = new ArrayList<>();
//        for (String name : list) {
//            if (name.length() == 4) {
//                filtered.add(name);
//            }
//        }
//        Collections.sort(filtered);
//        var iter = filtered.iterator();
//        if (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//        if (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
