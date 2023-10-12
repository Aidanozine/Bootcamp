package OCP.Ch13.Threads;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class TestingParallel {
    public static void main(String[] args) {
//        Collection<Integer> collection = List.of(1,2);
//        Stream<Integer> p1 = collection.stream().parallel();
//        Stream<Integer> p2 = collection.parallelStream();
//----------------------------------------------------------------
//        long start = System.currentTimeMillis();
//         List.of(1,2,3,4,5)
//         .stream()
//         .map(w -> doWork(w))
////         .forEach(s -> System.out.print(s + " "));
//         .forEachOrdered(s -> System.out.print(s + " "));
//
//         System.out.println();
//         var timeTaken = (System.currentTimeMillis()-start)/1000;
//         System.out.println("Time: "+timeTaken+" seconds");
//---------------------------------------------------------------
        System.out.print(List.of(1,2,3,4,5,6)
                .parallelStream() //unpredictable
                .findAny()
                .get());
    }

    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return input;
    }
}
