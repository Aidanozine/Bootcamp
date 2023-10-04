/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9.Wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desmo
 */
public class UnboundWildcard {
    public static void printList(List<?> list) {
        for (Object x: list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");

        List<Object> objects = new ArrayList<>();
        objects.add(new Object());

        printList(keywords);
        printList(objects);
    }
}
