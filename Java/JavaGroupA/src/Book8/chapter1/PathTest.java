package Book8.chapter1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book2\\chapter1\\Greeter.java");
            if (Files.exists(p)){
                System.out.println("File exists");
            } else {
                System.out.println("File doesn't exist");
            }
    }
}
