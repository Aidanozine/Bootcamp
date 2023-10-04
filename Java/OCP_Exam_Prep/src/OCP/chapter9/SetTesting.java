/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author desmo
 */
public class SetTesting {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        set.forEach(System.out::println);

        Set<Integer> hashset = new HashSet<>();
        boolean ret = hashset.add(66);
        set.add(10);
        set.add(66);
        set.add(8);
        System.out.println(ret);

        Set<Integer> treeset = new TreeSet<>();
        boolean ret2 = treeset.add(66);
        set.add(10);
        set.add(66);
        set.add(8);
        System.out.println(ret2);

        Set<Character> alphabet = Set.of('a', 'b', 'c', 'd', 'e');
        Set<Character> copy = Set.copyOf(alphabet);
        System.out.println(alphabet);
        System.out.println(copy);

    }
}
