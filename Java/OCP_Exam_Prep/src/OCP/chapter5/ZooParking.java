/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter5;

import static java.util.Arrays.asList;
import static java.lang.Math.random;
import static java.lang.Math.PI;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author desmo
 */
public class ZooParking {
    public static void main(String[] args) {
        List<String> list = asList("one","two");
        double random = random(); //also redundant with import
//          double random = Math.random(); //redundant with import
          System.out.println(random());
          System.out.println(PI);
    }
}

//import static java.util.Arrays.asList; //redundant
//import static java.lang.Math.random; //redundant
//import static java.lang.Math.PI; //redundant

//import java.util.Arrays;
//import java.util.List;
//
//import static java.lang.Math.random;
//
///**
// *
// * @author desmo
// */
//public class ZooParking {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("one","two"); // "Arrays." makes import redundant
//        double random = Math.random();
//        System.out.println(random());
////        System.out.println(PI);
//        
//    }
//}
