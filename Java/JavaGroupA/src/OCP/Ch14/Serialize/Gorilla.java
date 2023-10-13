package OCP.Ch14.Serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gorilla implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Gorilla{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendly=" + friendly +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }

    public Gorilla(String name, int age, Boolean friendly) {
        this.name = name;
        this.age = age;
        this.friendly = friendly;
    }

    private String name;
    private int age;
    private Boolean friendly;
    private transient String favoriteFood;
// Constructors/Getters/Setters/toString() omitted

    public static void main(String[] args) throws Exception {
        var gorillas = new ArrayList<Gorilla>();
        gorillas.add(new Gorilla("Grodd", 5, false));
        gorillas.add(new Gorilla("Ishmael", 8, true));
        File dataFile = new File("C:\\BootCampData\\Folder1\\Folder2\\enclosure\\gorilla.data");
        saveToFile(gorillas, dataFile);
        var gorillasFromDisk = readFromFile(dataFile);
        System.out.print(gorillasFromDisk);
    }

    static void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Gorilla gorilla : gorillas) {
                out.writeObject(gorilla);
            }
        }
    }

    static List<Gorilla> readFromFile(File dataFile) throws IOException,
            ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Gorilla g)
                    gorillas.add(g);
            }
        } catch (EOFException e) {
// File end reached
        }
        return gorillas;
    }
}

class Cat implements Serializable {
    private Tail tail = new Tail();
}

class Tail implements Serializable {
//    private Fur fur = new Fur();
private transient Fur fur = new Fur();
}

class Fur implements Serializable {}