package OCP.Ch14;

import java.io.File;

public class CreatingFiles {
    public static void main(String[] args) {
        File zooFile1 = new File("/home/tiger/data/stripes.txt");
        File zooFile2 = new File("/home/tiger", "data/stripes.txt");
        File parent = new File("/home/tiger");
        File zooFile3 = new File(parent, "data/stripes.txt");
        System.out.println(zooFile1.exists());
        System.out.println(zooFile2.exists());
        System.out.println(zooFile3.exists());
        System.out.println(parent.exists());

        File testFile = new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA");
        System.out.println(testFile.exists());
        File testParent = new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java");
        System.out.println(testParent.exists());
    }
}
