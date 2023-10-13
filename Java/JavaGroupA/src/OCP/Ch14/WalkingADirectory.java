package OCP.Ch14;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkingADirectory {
    public static void main(String[] args) throws Exception {
        var path = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCP\\Ch14\\Milkshake.txt");
        WalkingADirectory w = new WalkingADirectory();
        System.out.println(w.getPathSize(path));
    }
    private long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
    public long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .peek(System.out::println)
                    .mapToLong(this::getSize)
                    .sum();
        }
    }
}
