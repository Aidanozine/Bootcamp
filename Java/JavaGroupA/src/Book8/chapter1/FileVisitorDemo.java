package Book8.chapter1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorDemo {
    public static void main(String[] args) {
        Path start = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java");
        MyFileVisitor visitor = new MyFileVisitor();
        try {
            Files.walkFileTree(start, visitor);
        } catch (Exception e){
            System.out.println("Error encountered: " + e);
        }
    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path> {
        public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult visitFileFailed(Path file, BasicFileAttributes attr){
            System.out.println("Could not access: " + file.toString());
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult visitDirectoryFailed(Path dir, IOException e) {
            System.out.println("Could not access: " + dir.toString());
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr) throws IOException {
            System.out.println("Could not access: " + dir.toString());
            return FileVisitResult.CONTINUE;
        }
    }
    }
