/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class ReductionTest {
    public static void main(String[] args) {
        var array = new String[]{"b","i","g"," ","d","o","g"};
        var result = "";
        
        for(var s : array){
            result = result + s;
        }
        System.out.println(result);
        
        Stream<String> stream = Stream.of("b","i","g"," ","d","o","g");
//        String word = stream.reduce("",(s,c) -> s + c);
//        System.out.println("Reduction with a stream:");
//        System.out.println(word);
        
        String word = stream.reduce("2",(s,c) -> s + c); //c: array element (searcher) s: result aka "the accumulator"
        System.out.println("Reduction with a stream:");
        System.out.println(word);
    }
}
