package ExercisesAdvJava.Lesson_14.Prac_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class P02NioRead {

    public static void main(String[] args) {

        try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\ExercisesAdvJava\\Lesson_13\\Prac_1\\DeclarationOfIndependence.txt"))){

            System.out.println("\n=== Entire File ===");
            lines.forEach(line -> System.out.println(line));

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
