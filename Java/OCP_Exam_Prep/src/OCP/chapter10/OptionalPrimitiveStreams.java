/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter10;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author desmo
 */
public class OptionalPrimitiveStreams {

    public static void main(String[] args) {
//        var stream = IntStream.rangeClosed(1, 10);
//        OptionalDouble optional = stream.average();
//        optional.ifPresent(System.out::print);
//        System.out.println(optional.getAsDouble());
//        System.out.println(optional.orElseGet(() -> Double.NaN));

//        LongStream longs = LongStream.of(5, 10);
//        long sum = longs.sum();
//        System.out.println(sum);
//        DoubleStream dub = DoubleStream.generate(() -> Math.PI);
//        OptionalDouble min = dub.min(); // infinite loop
//        dub.min(); //alternate version to above
//-----------------------------------------------------------------
        IntStream stream = IntStream.of(1, 2, 3);
        IntStream stream2 = IntStream.of();
//        System.out.println(max(stream));
//        System.out.println(max(stream2)); //Throws exception

        System.out.println(range(stream));
        System.out.println(range(stream2)); //Throws exception
//-----------------------------------------------------------------

    }

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) {
            throw new RuntimeException();
        }
        return stats.getMax() - stats.getMin();
    }
}
