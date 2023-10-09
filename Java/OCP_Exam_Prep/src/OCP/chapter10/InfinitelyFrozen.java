/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class InfinitelyFrozen {

    public static void main(String[] args) {
//        Stream.generate(()-> "Elsa") //infinite stream
//                .filter(n-> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);
//---------------------------------------------------------
//        Stream.generate(() -> "Elsa") //infinite stream made finite
//                .filter(n -> n.length() == 4)
//                .limit(2) //stops more than 2 running through
//                .sorted()
//                .forEach(System.out::println);
//---------------------------------------------------------
//        Stream.generate(()-> "Olaf Lazisson")
//                .filter(n-> n.length() == 4) //infinite rejection
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);
//---------------------------------------------------------
//        Stream.generate(() -> "Olaf Lazisson")
//                .filter(n -> n.length() > 5) //low standards
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);
//---------------------------------------------------------
//        long count = Stream.of("goldfish", "finch") //pipleline 1 --> source
//                .filter(s -> s.length() > 5)
//                .collect(Collectors.toList()) //pipeline1 --> terminal operation 
//                .stream() //pipeline 2 --> source
//                .count(); //pipleine 2 --> terminal operation
//        System.out.println(count); // 1
//---------------------------------------------------------
        List<String> helper = Stream.of("goldfish", "finch")
                .filter(s-> s.length() > 5)
                /*.peek(System.out::println*/
                .collect(Collectors.toList());
        long count = helper.stream()
                .count();
        System.out.println(count); //pg557
    }
}
