/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter9;

import java.util.ArrayList;

/**
 *
 * @author desmo
 */
public class TestArrayList {

    public static void main(String[] args) {
        var string = new ArrayList<>(); //no type is why needs to be object
        string.add("a");
        string.add("b");
        string.add("c");
//        for (String s : string) {} // DOES NOT COMPILE
        for (Object s : string) {
            System.out.println(s);
        }
    }
}
