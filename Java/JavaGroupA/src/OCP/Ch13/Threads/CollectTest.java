package OCP.Ch13.Threads;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Stream;

public class CollectTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("c","a","n","i","s"," ","l","u","p","u","s").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, //"skip" tells you it deals with sort --> sorts alphabetically + removes duplicates
                Set::add,
                Set::addAll);
        System.out.println(set);
    }
}
