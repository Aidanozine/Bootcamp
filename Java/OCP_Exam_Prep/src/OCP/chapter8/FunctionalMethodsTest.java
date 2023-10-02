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

public class FunctionalMethodsTest {

    public static void main(String[] args) {
//                Predicate<String> egg = s -> s.contains("egg");
//                System.out.println(egg.test("egg"));
//                Predicate<String> brown = b -> b.contains("brown");
//                System.out.println(brown.test("brown"));
                
//                Predicate<String> brownEggs = bE -> bE.contains("eggs") && bE.contains("brown");
//                System.out.println(brownEggs.test("brown eggs"));
//                Predicate<String> someBrown = sB -> sB.contains("eggs") || sB.contains("scrambled");
//                System.out.println(someBrown.test("scrambled eggs"));

//                Consumer<String> c1 = x -> System.out.print("1: " + x);
//                Consumer<String> c2 = x -> System.out.print(",2: " + x);
//                Consumer<String> combined = c1.andThen(c2);
//                combined.accept("Garfield");

                Function<Integer, Integer> before = x -> x + 1;
                Function<Integer, Integer> after = x -> x * 2;
        
                Function<Integer, Integer> combined = after.compose(before);
                System.out.println(combined.apply(3));
        
        
//        (var x, y) -> "Hello" // DOES NOT COMPILE
//        (var x,Integer y) -> true; // DOES NOT COMPILE
//        (String x, var y, Integer) -> true; // DOES NOT COMPILE
//        (Integer x, y) -> "goodbye";
//        counts((x, y) -> 5);
//        counts2((var x, var y) -> true);
//        counts3((String x, Double y, Integer z) -> true);
//        counts4((x, y) -> "goodbye");
    }

//    public void variables(int a) {
//        int b = 1;
//        Predicate<Integer> p1 = a2 -> {
//            int b2 = 0;
//            int c = 0;
//            return b == c;
//        };
//    }
//
//    static void counts(TestingA a) {
//        System.out.println(a.testTestA(2, 4));
//    }
//    
//    static void counts2(TestingB b) {
//        System.out.println(b.testTestB("dog", 3));
//    }
//    
//    static void counts3(TestingC c) {
//        System.out.println(c.testTestC(6, "birds"));
//    }
//    
//    static void counts4(TestingD d) {
//        System.out.println(d.testTestD("dog", "fish"));
//    }
}

//interface TestingA{
//Integer testTestA(int n1, int n2);
//}
//
//interface TestingB{
//Boolean testTestB(String n1, int n2);
//}
//
//interface TestingC{
//Boolean testTestC(int n1, String n2);
//}
//
//interface TestingD{
//String testTestD(String n1, String n2);
//}
