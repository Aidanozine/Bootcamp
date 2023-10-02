/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.*;

/**
 *
 * @author desmo
 */
//public class ImplementingSupplier {
//    public static void main(String[] args) {
//        Supplier<LocalDate> methodRef = LocalDate::now; //Reference method
//        LocalDate d1 = methodRef.get();
//        System.out.println(d1);
//        
//        Supplier<LocalDate> lambda = () -> LocalDate.now(); //Lambda method
//        LocalDate d2 = lambda.get();
//        System.out.println(d2);
//    }
//}


//public class ImplementingSupplier{
//    public static void main(String[] args) {
//        Supplier<StringBuilder> methodRef = StringBuilder::new;
//        StringBuilder sb1 = methodRef.get();
//        System.out.println(sb1); //empty string
//        
//        Supplier<StringBuilder> lambda = () -> new StringBuilder();
//        StringBuilder sb2 = lambda.get();
//        System.out.println(sb2); //empty string
//    }
//}
//
//interface Supplier<T>{
//    T get();
//}


public class ImplementingSupplier {

    public static void main(String[] args) {
        Supplier<ArrayList<String>> arList = ArrayList::new;
        ArrayList<String> x = arList.get();
        System.out.println(x);
    }
}

//interface Supplier<T> {
//
//    T get();
//}
