package OCP.Ch14;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Create_Move_Copy_Delete {
    public static void main(String[] args) throws Exception {
//        Files.createDirectory(Path.of("\\sLink"));
//        Files.createDirectories(Path.of("/sLink/newFolder"));
//----------------------------------------------------------------------
//        Files.copy(Paths.get("C:/BootCampData/Folder1/Folder2/zoo.txt"),
//                Paths.get("/sLink/newFolder"));
//        Files.copy(Paths.get("C:/BootCampData/Folder1/Folder2/zoo.txt"), Paths.get("/sLink/newFolder/zoo.txt"));
//----------------------------------------------------------------------
//        Files.copy(Paths.get("C:\\sLink\\newFolder\\zoo.txt"), Paths.get("C:\\BootCampData\\Folder1\\Folder2\\zoo2.txt"),
//                StandardCopyOption.REPLACE_EXISTING);
//----------------------------------------------------------------------
//        try (var is = new FileInputStream("C:\\sLink\\newFolder\\zoo.txt")) {
// Write I/O stream data to a file
//                Files.copy(is, Paths.get("C:\\sLink\\newFolder\\zoo2.txt"));
//}
//Files.copy(Paths.get("C:\\BootCampData\\Folder1\\Folder2\\zoo.txt"), System.out);
//------------------------------------------------------------------------
//        var file = Paths.get("C:\\sLink\\newFolder\\zoo.txt");
//        var directory = Paths.get("C:\\BootCampData\\Folder1\\Folder2\\enclosure\\zoo.txt");
//        Files.copy(file, directory);
//------------------------------------------------------------------------
//        Files.move(Path.of("C:\\sLink\\newFolder\\zoo2.txt"), Path.of("C:\\BootCampData\\Folder1\\Folder2\\enclosure\\zoo.txt"),
//                StandardCopyOption.ATOMIC_MOVE);
//------------------------------------------------------------------------
//        Files.delete(Paths.get("C:\\sLink\\newFolder\\zoo.txt"));
//        Files.deleteIfExists(Paths.get("C:\\BootCampData\\Folder1\\Folder2\\enclosure\\zoo.txt"));
//------------------------------------------------------------------------
        System.out.println(Files.isSameFile(
                Path.of("C:\\sLink\\newFolder\\cobra"),
                Path.of("C:\\sLink\\newFolder\\snake")));

        System.out.println(Files.isSameFile(
                Path.of("C:\\sLink\\newFolder\\monkey\\ears.txt"),
                Path.of("C:\\sLink\\newFolder\\wolf\\ears.txt")));

        System.out.println(Files.mismatch(
                Path.of("C:\\sLink\\newFolder\\monkey.txt"),
                Path.of("C:\\sLink\\newFolder\\wolf.txt")));
    }
}
