package OCP.Ch14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchingADirectory {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src");
        long minSize = 1_000;
        try (var s = Files.find(path, 10,
                (p, a) -> a.isRegularFile()
                                && p.toString().endsWith(".java")
                                && a.size() > minSize)) {
            s.forEach(System.out::println);
        }
    }
}
