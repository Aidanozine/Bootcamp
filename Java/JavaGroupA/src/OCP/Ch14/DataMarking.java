package OCP.Ch14;

import java.io.*;

public class DataMarking {
    public static void main(String[] args) throws Exception {
//        BufferedInputStream reader = new BufferedInputStream(new FileInputStream("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCP\\Ch14\\Chocolate.txt"));
//        readData(reader);

        BufferedInputStream reader = new BufferedInputStream(new FileInputStream("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\OCP\\Ch14\\Milkshake.txt"));
        readData2(reader);
    }
    public static void readData(InputStream is) throws IOException { //text: YUM!
        System.out.print((char) is.read()); //Y
        if (is.markSupported()) {
            is.mark(100); // Marks up to 100 bytes
            System.out.print((char) is.read());
            System.out.print((char) is.read());
            is.reset(); // Resets stream to position before U
        }
        System.out.print((char) is.read()); //M
        System.out.print((char) is.read()); //U
        System.out.print((char) is.read()); //M
    }

    public static void readData2(InputStream is) throws IOException { //text: LIME!
        System.out.print ((char)is.read()); // L
        is.skip(2); // Skips I and M
        is.read(); // Reads E but doesn't output it
        System.out.print((char)is.read()); // !
        System.out.print((char)is.read()); // (white space)
    }
}
