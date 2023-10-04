/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author desmo
 */
public class Duck2 implements Comparable<Duck2> {

    private String name;

    public int weight;

    public Duck2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Duck2 d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
//        Comparator<Duck2> byWeight = new Comparator<Duck2>() {
//            public int compare(Duck2 d1, Duck2 d2) {
//                return d1.weight - d2.weight;
//            }
//        };
        Comparator<Duck2> byWeight = (d1, d2) -> d1.weight - d2.weight;

        var duck = new ArrayList<Duck2>();
        duck.add(new Duck2("Daffy",9));
        duck.add(new Duck2("Donald",7));
        Collections.sort(duck); //sorts by name
        System.out.println(duck);
        Collections.sort(duck, byWeight);
        System.out.println(duck);
    }
}
