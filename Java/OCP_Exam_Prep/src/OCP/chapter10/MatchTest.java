/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class MatchTest {

    public static void main(String[] args) {
        var list = List.of("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(()-> "chimp");
        
        Predicate<String> pred = x-> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); //at least one is <String>
        System.out.println(list.stream().allMatch(pred)); //all are <String>
        System.out.println(list.stream().noneMatch(pred)); //none are <String>
        System.out.println(infinite.anyMatch(pred)); //any are <String>
    }
}
