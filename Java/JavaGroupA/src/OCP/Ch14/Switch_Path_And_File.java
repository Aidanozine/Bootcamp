package OCP.Ch14;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Switch_Path_And_File {
    public static void main(String[] args) {
//        File file = new File("rabbit");
//        Path nowPath = file.toPath();
//        File backToFile = nowPath.toFile();
//-------------------------------------------------------------------------
        Path zooPath1 = FileSystems.getDefault()
                .getPath("C:/Users/desmo/Desktop/Bootcamp/Java/JavaGroupA");
        System.out.println(Files.exists(zooPath1));
        Path zooPath2 = FileSystems.getDefault()
                .getPath("/Bootcamp", "Java", "JavaGroupA", "src", "Book2", "chapter7");
        System.out.println(Files.exists(zooPath2));
    }
}
