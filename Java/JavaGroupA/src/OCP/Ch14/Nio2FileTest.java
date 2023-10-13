package OCP.Ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Nio2FileTest {
    public static void main(String[] args) throws Exception {
        Path in = Paths.get("C:\\BootCampData\\Folder1\\Folder2\\zoo.txt");
        Path out = Paths.get("C:\\BootCampData\\Folder1\\Folder2\\zoo2.txt");
        Path out2 = Paths.get("C:\\BootCampData\\Folder1\\Folder2\\zoo3.txt");
        Path out3 = Paths.get("C:\\BootCampData\\Folder1\\Folder2\\zoo4.txt");
        Path warn = Paths.get("C:\\BootCampData\\Folder1\\Folder2\\Sharks.log");

        Nio2FileTest n = new Nio2FileTest();
        copyPathAsString(in, out);
        copyPathAsBytes(out, out2);
        copyPathAsLines(out2, out3);

        readLazily(in);
        System.out.println();
        readLazily(out);
        System.out.println();
        readLazily(out2);
        System.out.println();
        readLazily(out3);System.out.println();

        readLazily2(warn);
    }

    private static void copyPathAsString(Path input, Path output) throws IOException {
        String string = Files.readString(input);
        Files.writeString(output, string);
    }
    private static void copyPathAsBytes(Path input, Path output) throws IOException {
        byte[] bytes = Files.readAllBytes(input);
        Files.write(output, bytes);
    }
    private static void copyPathAsLines(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        Files.write(output, lines);
    }

    private static void readLazily(Path path) throws IOException {
        try (Stream<String> s = Files.lines(path)) {
            s.forEach(System.out::println);
        } try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("Hello"))
//                    .map(f -> f.substring(5))
                    .map(f -> f.substring(0, 4))
                    .forEach(System.out::println);
        }
    }

    private static void readLazily2(Path path) throws IOException {
        try (Stream<String> s = Files.lines(path)) {
            s.forEach(System.out::println);
            System.out.println("WARNINGS");
        } try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("WARN"))
                    .map(f -> f.substring(5))
                    .forEach(System.out::println);
        }
    }
}
