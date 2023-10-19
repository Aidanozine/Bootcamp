package ExercisesAdvJava.Lesson_14.Prac_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P03NioReadAll {

    public static void main(String[] args) {

        List<String> fileArr;
        Path file =  Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\ExercisesAdvJava\\Lesson_13\\Prac_1\\DeclarationOfIndependence.txt");

        try{
            fileArr = Files.readAllLines(file);

            System.out.println("\n=== United ===");
            fileArr.stream()
                    .filter(line -> line.contains("United"))
                    .forEach(line -> System.out.println(line));

            System.out.println("\n=== America ===");
            fileArr.stream()
                    .filter(line -> line.contains("America"))
                    .forEach(line -> System.out.println(line));


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
