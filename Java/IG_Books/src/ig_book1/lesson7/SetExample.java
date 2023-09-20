/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ig_book1.lesson7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author desmo
 */
public class SetExample {
 public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    
    set.add("one");
    set.add("two");
    set.add("three");
    set.add("three");
    
    for (String item:set){
    System.out.println("Item: " + item);
    }
 }
}
