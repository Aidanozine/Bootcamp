package ExercisesAdvJava.Lesson_14.Prac_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class P04NioReadAll {
    public static void main(String[] args) {

        Path file =  Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\ExercisesAdvJava\\Lesson_13\\Prac_1\\DeclarationOfIndependence.txt");
        List<String> fileArr;

        try{
            fileArr = Files.readAllLines(file);

            System.out.println("\n=== Country ===");
            long wordCount = fileArr.stream()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .filter(word -> word.contains("Country"))
                    .peek(word -> System.out.println(word))
                    .count();
            System.out.println("Word count: " + wordCount);

            System.out.println("\n===States===");
            wordCount = fileArr.stream()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .filter(word -> word.contains("States"))
                    .peek(word -> System.out.println(word))
                    .count();
            System.out.println("Word count: " + wordCount);

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
