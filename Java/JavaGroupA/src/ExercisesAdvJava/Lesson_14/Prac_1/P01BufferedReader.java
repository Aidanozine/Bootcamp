package ExercisesAdvJava.Lesson_14.Prac_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01BufferedReader {

    public static void main(String[] args) {

        try{
            BufferedReader bReader =
                    new BufferedReader(new FileReader("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\ExercisesAdvJava\\Lesson_13\\Prac_1\\DeclarationOfIndependence.txt"));

            System.out.println("=== Entire File ===");
            bReader.lines()
                    .forEach(line ->
                            System.out.println(line));

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
