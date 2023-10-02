/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

/**
 *
 * @author desmo
 */
import java.util.function.*;

public class ImplementingFunction {
    public static void main(String[] args) {
        System.out.println("Function:");
        Function<String, Integer> methodRef = String::length;
        System.out.println(methodRef.apply("Panther"));
        Function<String, Integer> lambda = x -> x.length();
        System.out.println(lambda.apply("Tiger"));
        
        System.out.println("BiFunction:");
        BiFunction<String, String, String> methodRef2 = String::concat;
        System.out.println(methodRef2.apply("Little ", "Lion"));
        BiFunction<String, String, String> lambda2 = (s, x) -> s.concat(x);
        System.out.println(lambda2.apply("Spotted ", "Leopard"));
        
//        Function<List<String>, String> ex1 = x -> x.get(0);
    }
}

//@FunctionalInterface
//interface Function<T, R>{
//    R apply(T t);
//}
//
//@FunctionalInterface
//interface BiFunction<T, U, R>{
//    R apply(T t, U u);
//}