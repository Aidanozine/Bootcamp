package Book2.chapter8;

import java.io.*;
public class FileException2 {
    public static void main(String[] args) {
        try {
            openFile("c:/test.txt");
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    public static void openFile(String name)  throws FileNotFoundException {
            FileInputStream f = new FileInputStream(name);
    }
}
