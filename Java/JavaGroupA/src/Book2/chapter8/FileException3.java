package Book2.chapter8;

import java.io.*;
public class FileException3 {
    public static void main(String[] args) throws FileNotFoundException { //throws up never down
        openFile("c:/test.txt");
    }

    public static void openFile(String name) throws FileNotFoundException {
        FileInputStream f = new FileInputStream(name);
    }
}
