package OCP.Ch14.Serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Chimpanzee implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';
    { this.age = 14; }

    public Chimpanzee() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }
    public Chimpanzee(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public static void main(String[] args) throws Exception {
        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
        File dataFile = new File("C:\\BootCampData\\Folder1\\Folder2\\enclosure\\chimpanzee.data");
        saveToFile(chimpanzees, dataFile);
        var chimpanzeesFromDisk = readFromFile(dataFile);
        System.out.println(chimpanzeesFromDisk);
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static void saveToFile(List<Chimpanzee> chimps, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Chimpanzee chimp : chimps) {
                out.writeObject(chimp);
            }
        }
    }

    static List<Chimpanzee> readFromFile(File dataFile) throws IOException,
            ClassNotFoundException {
        var chimps = new ArrayList<Chimpanzee>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Chimpanzee ch)
                    chimps.add(ch);
            }
        } catch (EOFException e) {
// File end reached
        }
        return chimps;
    }
}
