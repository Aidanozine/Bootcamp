/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author desmo
 */
public class Duck implements Comparable<Duck> {
    private String name;
    public Duck(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name;
    }
    
    public int compareTo(Duck d){
        return name.compareTo(d.name);
    }
    
    public static void main(String[] args) {
        var duck = new ArrayList<Duck>();
        duck.add(new Duck("Daffy"));
        duck.add(new Duck("Donald"));
        Collections.sort(duck); //sorts by name
        System.out.println(duck);
    }
}
