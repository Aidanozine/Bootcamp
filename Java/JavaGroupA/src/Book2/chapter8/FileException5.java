package Book2.chapter8;

import java.io.*;
public class FileException5 {
    public static void main(String[] args) {
        openFile("c:/test.txt");
    }

    public static void openFile(String name) {
        try{
            FileInputStream f = new FileInputStream(name);
        } catch (FileNotFoundException e) {
        System.out.println(e);
    }
//        try {
//            FileInputStream f = new FileInputStream(name);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
