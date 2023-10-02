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

public class ImplementingPredicate { //Predicate and BiPredicate always return booleans
    public static void main(String[] args) {
        Predicate<String> methodRef = String::isEmpty;
        System.out.println(methodRef.test(""));
        Predicate<String> lambda = x -> x.isEmpty();
        System.out.println(lambda.test(""));
        
        BiPredicate<String, String> methodRef2 = String::startsWith;
        System.out.println(methodRef2.test("Bruce", "Lee"));
        BiPredicate<String, String> lambda2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(lambda2.test("Bull", "Dog"));
    }
}

//interface Predicate<T>{
//    boolean test(T t);
//}
//
//interface BiPredicate<T, U>{
//    boolean test(T t, U u);
//}
