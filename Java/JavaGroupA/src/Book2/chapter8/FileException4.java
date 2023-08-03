package Book2.chapter8;

import java.io.*;
public class FileException4 {
    public static void main(String[] args) {
       try {
           openFile("c:/test.txt");
       } catch (FileNotFoundException e) {} //not printing anything 'swallows' the issue
    }

    public static void openFile(String name) throws FileNotFoundException {
        FileInputStream f = new FileInputStream(name);
    }
}
