package Book2.chapter8;
import java.io.*;
public class FileException1 {
    public static void main(String[] args) {
        openFile("c:/test.txt");
    }

    public static void openFile(String name) {
        try {
            FileInputStream f = new FileInputStream(name);
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
