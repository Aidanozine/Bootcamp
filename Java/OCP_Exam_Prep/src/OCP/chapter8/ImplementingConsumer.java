/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/**
 *
 * @author desmo
 */
public class ImplementingConsumer {

    public static void main(String[] args) {
        Consumer<String> methodRef = System.out::println;
        Consumer<String> lambda = s -> System.out.println(s);
        methodRef.accept("bear");
        lambda.accept("dog");

        Map<String, Integer> map = new HashMap<>();

        BiConsumer<String, Integer> methodRef2 = map::put;
        BiConsumer<String, Integer> lambda2 = (s,i) -> map.put(s, i);
        methodRef2.accept("Chicken", 3);
        lambda2.accept("chick", 6);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

//interface Consumer<T> {
//
//    void accept(T t);
//}
//
//interface BiConsumer<T, U> {
//
//    void accept(T t, U u);
//}
