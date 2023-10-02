/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author desmo
 */
public class RemoveOnCondition {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("Mage");
        list.add("Assassin");
        list.add("Knight");
        list.add("Scout");
        list.add("Archer");
        System.out.println("Team: " + list);
        System.out.println("An Ogre attacks your team!");
        list.removeIf(s -> s.startsWith("A"));
        System.out.println("Remaining: " + list);
        
        Collection<String> set = new HashSet<>();
        set.add("Poof");
        set.add("");
        set.removeIf(String::isEmpty);
        System.out.println(set);
        System.out.println("Mage has fled");
    }
}
