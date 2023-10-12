package OCP.Ch13.Threads;

import java.util.List;

public class AccumulatorTest {
    public static void main(String[] args) {
//        System.out.println(List.of(1,2,3,4,5,6)
//                .parallelStream()
//                .reduce(0, (a, b) ->
//                        (a -b))); //Problematic Accumulator
//------------------------------------------------------------
        System.out.println(List.of("c","a","n","i","s"," ","l","u","p","u","s")
                .parallelStream()
                .reduce("X", String::concat)); // XwXoXlXf
    }
}
