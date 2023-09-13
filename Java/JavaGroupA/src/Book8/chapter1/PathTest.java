package Book8.chapter1;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
//        Path a = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book2\\chapter1\\Greeter.java");
//            if (Files.exists(a)){
//                System.out.println("File exists");
//            } else {
//                System.out.println("File doesn't exist");
//            }

//        Path b = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\chapter1\\CreatedFile.txt");
//        try {
//            Files.createFile(b);
//            System.out.println("File successfully created.");
//        } catch (Exception e) {
//            System.out.println("File couldn't be created." + " Error: " + e);
//        }

//        Path c = Paths.get("C:\\");
//        try {
//            DirectoryStream<Path> stream = Files.newDirectoryStream(c);
//            for (Path entry : stream){
//                System.out.println(entry);
//            }
//        } catch (Exception e){
//            System.out.println("Couldn't find directory. " + "Error: " + e);
//        }

        Path c = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\chapter1");
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(c, "*.txt");
            for (Path entry : stream){
                System.out.println(entry);
            }
        } catch (Exception e){
            System.out.println("Couldn't find directory. " + "Error: " + e);
        }
    }
}
