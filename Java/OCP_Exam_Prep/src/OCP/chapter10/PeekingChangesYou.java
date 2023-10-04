/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class PeekingChangesYou {

    public static void main(String[] args) {
        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');
        Stream<List<?>> stream = Stream.of(numbers, letters);
        stream.map(List::size).forEach(System.out::println); // 11

        System.out.println("Post-Peek");
        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(x -> x.remove(0)).map(List::size).forEach(System.out::println); //as peek runs through entire stream --> all data gets removed
    }
}
