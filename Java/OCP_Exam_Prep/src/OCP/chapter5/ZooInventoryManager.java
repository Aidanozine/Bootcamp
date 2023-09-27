/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

/**
 *
 * @author desmo
 */
import java.util.*;

public class ZooInventoryManager {

//    private static final String[] treats = new String[10];
//
//    public static void main(String[] args) {
//        treats[0] = "popcorn"; //can change if static
//    System.out.println(treats);
//    }
    
    private static final String[] TREATS = new String[10];

    public static void main(String[] args) {
//        TREATS[0] = new String[10]; //can't change a constant's reference
        TREATS[0] = "popcorn";
        System.out.println(TREATS[0]);
    }
}
