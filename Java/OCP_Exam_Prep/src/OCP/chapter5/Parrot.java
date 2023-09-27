/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author desmo
 */
public class Parrot {

    public static void print(List<Integer> i) {
        System.out.print("I");
    }

    public static void print(CharSequence c) {
        System.out.print("C");
    }

    public static void print(Object o) {
        System.out.print("O");
    }

    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2023, Month.SEPTEMBER, 26));
    }
}
