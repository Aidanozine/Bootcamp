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

public class ImplementingOperator {
    public static void main(String[] args) {
        System.out.println("Unary Operator:");
        UnaryOperator<String> methodRef = String::toUpperCase;
        System.out.println(methodRef.apply("Bark"));
        UnaryOperator<String> lambda = x -> x.toUpperCase();
        System.out.println(lambda.apply("Squeak"));
        
        System.out.println("Binary Operator:");
        BinaryOperator<String> methodRef2 = String::concat;
        System.out.println(methodRef2.apply("Dogs ", "Bark"));
        BinaryOperator<String> lambda2 = (s, x) -> s.concat(x);
        System.out.println(lambda2.apply("Questionable ", "Orange"));
        
        System.out.println("Other Tests:");
        UnaryOperator<Double> methodRef3 = Math::floor;
        System.out.println(methodRef3.apply(3.0));
        UnaryOperator<Double> lambda3 = d -> Math.floor(d);
        System.out.println(lambda3.apply(2.0));
        
        UnaryOperator<Integer> lambda4 = i -> i++;
        System.out.println(lambda4.apply(6));
        UnaryOperator<Integer> lambda5 = i -> ++i;
        System.out.println(lambda5.apply(6));
        
        BinaryOperator<Double> methodRef4 = Math::pow;
        System.out.println(methodRef4.apply(1.2, 3.4));
        BinaryOperator<Double> lambda6 = (d1, d2) -> Math.pow(d1, d2);
        System.out.println(lambda6.apply(3.4, 5.6));
    }
}

//@FunctionalInterface
//interface UnaryOperator<T> extends Function<T, T>{}
//
//@FunctionalInterface
//interface BinaryOperator<T> extends BiFunction<T, T, T>{}