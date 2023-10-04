/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author desmo
 */
public class ListTest {

    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array); // [a, b, c]
        List<String> copy = List.copyOf(asList); // [a, b, c]

        array[0] = "z";

        System.out.println(asList); // [z, b, c]
        System.out.println(of); // [a, b, c]
        System.out.println(copy); // [a, b, c]

//        of.set(0,"x"); // can't change
//        copy.set(0, "x"); // can't change
//        asList.add("y"); // can't change
        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x, b, c]

//        copy.add("y"); //Prints Exception: UnsupportedOperationException
    }
}
