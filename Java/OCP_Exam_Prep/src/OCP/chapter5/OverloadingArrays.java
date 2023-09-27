/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
public class OverloadingArrays {

    public static void walk(int[] ints) {
    }

    public static void walk(Integer[] integers) {
    }
    
    public static void main(String[] args) {
        walk(new int[3]); //won't work with types other than those speicified
    }
}
