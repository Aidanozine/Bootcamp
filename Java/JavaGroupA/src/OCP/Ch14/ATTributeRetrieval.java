package OCP.Ch14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class ATTributeRetrieval {
    public static void main(String[] args) throws Exception {
        var path = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCP\\Ch14\\Chocolate.txt");
//        BasicFileAttributes data = Files.readAttributes(path,
//                BasicFileAttributes.class);
//        System.out.println("Is a directory? " + data.isDirectory());
//        System.out.println("Is a regular file? " + data.isRegularFile());
//        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
//        System.out.println("Size (in bytes): " + data.size());
//        System.out.println("Last modified: " + data.lastModifiedTime());
        BasicFileAttributeView view = Files.getFileAttributeView(path,
                BasicFileAttributeView.class);
        BasicFileAttributes attributes = view.readAttributes();
        System.out.println(attributes.lastModifiedTime());
        FileTime lastModifiedTime = FileTime.fromMillis(attributes
                .lastModifiedTime()
                .toMillis() + 10_000);
        view.setTimes(lastModifiedTime, null, null);

        attributes = view.readAttributes();
        System.out.println(attributes.lastModifiedTime());
    }
}
