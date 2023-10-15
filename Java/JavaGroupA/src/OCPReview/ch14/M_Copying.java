package OCPReview.ch14;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class M_Copying {
    public static void main(String[] args) throws Exception {
//        // This reads the contents of an I/O stream and writes the output to a file.
//
//        try (var is = new FileInputStream("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCPReview\\ch14\\data\\zoo.txt")) {
//            // Write I/O stream data to a file
//            Files.copy(is, Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCPReview\\ch14\\data\\CopyOfzoo.txt"));
//        }
//
//        // This reads the contents of a file and writes the output to an I/O stream.
//        Files.copy(Paths.get("/data/copyOfZoo.txt"), System.out);

        // Copying Files into a directory
        var file = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCPReview\\ch14\\data\\zoo.txt");
        var directory = Paths.get("/data");
//
        // It thinks it will be copying the zoo.txt to a file named /data
        // And will give an exception because it already exists.
        // This will create a file named data with NO file extension
        directory = Paths.get("/data/data");
        // Final Fix: This will create a text-file named data
        directory = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCPReview\\ch14\\data\\data.txt");
        Files.copy(file, directory);
    }
}
